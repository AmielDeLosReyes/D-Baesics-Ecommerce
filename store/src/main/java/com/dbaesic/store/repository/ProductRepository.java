package com.dbaesic.store.repository;

import com.dbaesic.store.DTO.ProductAndImageDTO;
import com.dbaesic.store.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * JPA repository interface for Product entities.
 * Extends JpaRepository to inherit basic CRUD operations.
 *
 * @author Amiel De Los Reyes
 */
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT p.product_id, p.product_name, p.old_price, p.current_price, GROUP_CONCAT(pi.image_url) AS image_urls, p.product_description " +
            "FROM dbaesic.product p " +
            "JOIN dbaesic.product_image pi ON p.product_id = pi.product_id " +
            "GROUP BY p.product_id, p.product_name, p.old_price, p.current_price, p.product_description " +
            "LIMIT 0, 1000", nativeQuery = true)
    List<Object[]> findAllProductsAndImages();

    @Query(value = "SELECT p.product_id, p.product_name, pc.color_name, ps.size_name " +
            "FROM dbaesic.product p " +
            "JOIN dbaesic.product_image pi ON p.product_id = pi.product_id " +
            "JOIN dbaesic.product_color_mapping pcm ON p.product_id = pcm.product_id " +
            "JOIN dbaesic.product_color pc ON pcm.color_id = pc.color_id " +
            "JOIN dbaesic.product_size_mapping psm ON p.product_id = psm.product_id " +
            "JOIN dbaesic.product_size ps ON psm.size_id = ps.size_id " +
            "GROUP BY p.product_id, p.product_name, pc.color_name, ps.size_name " +
            "LIMIT 0, 1000", nativeQuery = true)
    List<Object[]> findAllProductColorAndSizes();


}
