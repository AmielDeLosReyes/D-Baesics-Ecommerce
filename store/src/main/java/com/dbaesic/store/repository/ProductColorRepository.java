package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductColor;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductColor entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ProductColorRepository extends JpaRepository<ProductColor, Integer> {
}
