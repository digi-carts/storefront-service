package com.digicart.storefront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/**
 * Spring Boot entry point for the <em>storefront-service</em> microservice.
 */
@SpringBootApplication
@EnableJpaAuditing
public class StorefrontServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(StorefrontServiceApplication.class, args);
    }
}
