package com.dbaesic.store.repository;

import com.dbaesic.store.entity.ProductColorMapping;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * JPA repository interface for ProductColorMapping entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 *
 * @author Amiel De Los Reyes
 */
public interface ProductColorMappingRepository extends JpaRepository<ProductColorMapping, Integer> {
}
