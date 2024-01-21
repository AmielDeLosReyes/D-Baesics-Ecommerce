package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product size mapping.
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

    public ProductSizeMapping() {
    }

    public ProductSizeMapping(int productId, int sizeId) {
        this.productId = productId;
        this.sizeId = sizeId;
    }

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

