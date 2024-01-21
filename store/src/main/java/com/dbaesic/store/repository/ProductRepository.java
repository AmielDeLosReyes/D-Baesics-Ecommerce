package com.dbaesic.store.repository;

import com.dbaesic.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for Product entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
