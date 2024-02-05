package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product size mapping.
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product_size_mapping")
@IdClass(ProductSizeMappingId.class)
public class ProductSizeMapping {

    @Id
    @Column(name = "product_id")
    private int productId;

    @Id
    @Column(name = "size_id")
    private int sizeId;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public ProductSizeMapping() {
    }

    /**
     * Parameterized constructor to initialize the product size mapping entity with details.
     *
     * @param productId The unique identifier of the product associated with the size.
     * @param sizeId    The unique identifier of the size associated with the product.
     */
    public ProductSizeMapping(int productId, int sizeId) {
        this.productId = productId;
        this.sizeId = sizeId;
    }

    // Getters and setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }
}
