package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductImage entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {
}
