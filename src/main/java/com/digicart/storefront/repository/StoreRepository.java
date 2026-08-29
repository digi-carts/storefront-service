package com.digicart.storefront.repository;

import com.digicart.storefront.entity.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

/**
 * Spring Data JPA repository for store  persistence.
 */
@Repository
public interface StoreRepository extends JpaRepository<Store, UUID> {
    Optional<Store> findByAdminId(String adminId);
    Optional<Store> findBySubdomain(String subdomain);
    Optional<Store> findByStoreUrlId(String storeUrlId);
    boolean existsByAdminId(String adminId);
    boolean existsBySubdomain(String subdomain);
}
