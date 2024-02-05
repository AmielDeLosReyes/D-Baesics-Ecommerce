package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductImage;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductImage entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 *
 * @author Amiel De Los Reyes
 */
public interface ProductImageRepository extends JpaRepository<ProductImage, Integer> {
}
