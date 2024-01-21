package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductSize entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ProductSizeRepository extends JpaRepository<ProductSize, Integer> {
}
