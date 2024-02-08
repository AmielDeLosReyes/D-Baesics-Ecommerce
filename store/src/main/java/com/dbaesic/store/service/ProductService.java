package com.dbaesic.store.service;

import com.dbaesic.store.DTO.ProductAndImageDTO;
import com.dbaesic.store.entity.*;
import com.dbaesic.store.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for handling business logic related to products.
 *
 * @author Amiel De Los Reyes
 */
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductColorRepository productColorRepository;
    private final ProductImageRepository productImageRepository;
    private final ProductColorMappingRepository productColorMappingRepository;
    private final ProductSizeRepository productSizeRepository;
    private final ProductSizeMappingRepository productSizeMappingRepository;

    @Autowired
    public ProductService(ProductRepository productRepository, ProductColorRepository productColorRepository,
                          ProductImageRepository productImageRepository, ProductColorMappingRepository productColorMappingRepository,
                          ProductSizeRepository productSizeRepository, ProductSizeMappingRepository productSizeMappingRepository) {
        this.productRepository = productRepository;
        this.productColorRepository = productColorRepository;
        this.productImageRepository = productImageRepository;
        this.productColorMappingRepository = productColorMappingRepository;
        this.productSizeRepository = productSizeRepository;
        this.productSizeMappingRepository = productSizeMappingRepository;
    }

    /**
     * Retrieves all products from the database.
     *
     * @return List of Product entities.
     */
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    /**
     * Retrieves all product colors from the database.
     *
     * @return List of ProductColor entities.
     */
    public List<ProductColor> getAllProductColors(){
        return productColorRepository.findAll();
    }

    /**
     * Retrieves all product color mappings from the database.
     *
     * @return List of ProductColorMapping entities.
     */
    public List<ProductColorMapping> getAllProductColorMappings(){
        return productColorMappingRepository.findAll();
    }

    /**
     * Retrieves all product images from the database.
     *
     * @return List of ProductImage entities.
     */
    public List<ProductImage> getAllProductImages(){
        return productImageRepository.findAll();
    }

    /**
     * Retrieves all product sizes from the database.
     *
     * @return List of ProductSize entities.
     */
    public List<ProductSize> getAllProductSizes(){
        return productSizeRepository.findAll();
    }

    /**
     * Retrieves all product size mappings from the database.
     *
     * @return List of ProductSizeMapping entities.
     */
    public List<ProductSizeMapping> getAllProductSizeMappings(){
        return productSizeMappingRepository.findAll();
    }

    /**
     * Retrieves all product information WITH their images.
     *
     * @return List of row in the data.
     */
    public List<Object[]> getAllProductsAndImages() {
        return productRepository.findAllProductsAndImages();
    }

    /**
     * Retrieves all product colors and sizes from the database.
     * Delegates the call to the ProductRepository's findAllProductColorAndSizes method.
     *
     * @return List of Object arrays containing product ID, product name, color name, and size name.
     */
    public List<Object[]> getAllProductColorAndSizes() {
        return productRepository.findAllProductColorAndSizes();
    }
}
