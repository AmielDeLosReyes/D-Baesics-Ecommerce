package com.dbaesic.store.restcontroller;

import com.dbaesic.store.entity.*;
import com.dbaesic.store.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * REST Controller for handling product-related endpoints.
 */
@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Retrieves all products and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of Product entities.
     */
    @GetMapping("/get-products")
    public ResponseEntity<List<Product>> getProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

    /**
     * Retrieves all product colors and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of ProductColor entities.
     */
    @GetMapping("/get-product-colors")
    public ResponseEntity<List<ProductColor>> getProductColors() {
        List<ProductColor> productColors = productService.getAllProductColors();
        return new ResponseEntity<>(productColors, HttpStatus.OK);
    }

    /**
     * Retrieves all product color mappings and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of ProductColorMapping entities.
     */
    @GetMapping("/get-product-color-mappings")
    public ResponseEntity<List<ProductColorMapping>> getProductColorMappings() {
        List<ProductColorMapping> productColorMappings = productService.getAllProductColorMappings();
        return new ResponseEntity<>(productColorMappings, HttpStatus.OK);
    }

    /**
     * Retrieves all product images and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of ProductImage entities.
     */
    @GetMapping("/get-product-images")
    public ResponseEntity<List<ProductImage>> getProductImages() {
        List<ProductImage> productImages = productService.getAllProductImages();
        return new ResponseEntity<>(productImages, HttpStatus.OK);
    }

    /**
     * Retrieves all product sizes and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of ProductSize entities.
     */
    @GetMapping("/get-product-sizes")
    public ResponseEntity<List<ProductSize>> getProductSizes() {
        List<ProductSize> productSizes = productService.getAllProductSizes();
        return new ResponseEntity<>(productSizes, HttpStatus.OK);
    }

    /**
     * Retrieves all product size mappings and returns them as a ResponseEntity.
     *
     * @return ResponseEntity containing a List of ProductSizeMapping entities.
     */
    @GetMapping("/get-product-size-mappings")
    public ResponseEntity<List<ProductSizeMapping>> getProductSizeMappings() {
        List<ProductSizeMapping> productSizeMappings = productService.getAllProductSizeMappings();
        return new ResponseEntity<>(productSizeMappings, HttpStatus.OK);
    }

}
