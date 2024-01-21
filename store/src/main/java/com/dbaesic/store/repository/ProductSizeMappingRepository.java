package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductSizeMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductSizeMapping entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ProductSizeMappingRepository extends JpaRepository<ProductSizeMapping, Integer> {
}
