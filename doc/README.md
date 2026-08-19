# storefront-service

Public store resolution for the shopper app (subdomain / admin / id). Port **3009**, schema **`store_svc`** (shared with store-service).

Platform design: [System design](https://github.com/digi-carts/doc/blob/main/architecture/system-design.md)

## Domain

Gateway marks `/api/storefront/**` as **public** (no JWT). This service exposes `Store` lookup so storefront can resolve a tenant from hostname or `/s/[store]` slug.

Controllers currently implement full CRUD on `/stores`, not a read-only surface. Prefer using **store-service** for merchant writes; use this service for unauthenticated resolution once paths are aligned with `/api/storefront`.

Liquibase changelog exists for `store_svc` in this repo as well — run only one schema owner in a given environment to avoid migration races.

## Tech stack

Java 21, Spring Boot 3.3.0, Web, JPA, Validation, Liquibase, PostgreSQL.

## HTTP API

### Stores — `/stores`

| Method | Path | Typical storefront use |
|--------|------|------------------------|
| GET | `/stores` | Admin / listing |
| GET | `/stores/{id}` | Direct id |
| GET | `/stores/admin/{adminId}` | Merchant mapping |
| GET | `/stores/subdomain/{subdomain}` | Host rewrite |
| POST / PUT / DELETE | `/stores`… | Writes (prefer store-service) |

### Health

`GET /health`

## Configuration

| Variable | Required | Default |
|----------|----------|---------|
| `DATABASE_URL` | yes | schema `store_svc` |
| `PORT` | no | `3009` |

## Local run

```bash
export DATABASE_URL="jdbc:postgresql://localhost:5432/digicarts?currentSchema=store_svc"
mvn spring-boot:run
```

## CI/CD

`digi-cart-storefront-service-dev` / `digi-cart-storefront-service`.

## Related

- [store-service](https://github.com/digi-carts/store-service/blob/stage/doc/README.md)
- [storefront](https://github.com/digi-carts/storefront/blob/stage/doc/README.md) (`middleware.ts` host rewrite)
- [api-gateway](https://github.com/digi-carts/api-gateway/blob/stage/doc/README.md) public `/api/storefront/**`

## REST API reference

See [api.md](api.md) for every HTTP endpoint generated from Spring controllers.
