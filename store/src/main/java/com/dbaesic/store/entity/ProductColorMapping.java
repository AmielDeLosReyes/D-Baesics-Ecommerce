package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product color mapping.
 */
@Entity
@Table(name = "product_color_mapping")
@IdClass(ProductColorMappingId.class)
public class ProductColorMapping {

    @Id
    @Column(name = "product_id")
    private int productId;

    @Id
    @Column(name = "color_id")
    private int colorId;

    // Constructors, getters, setters, and other methods

    public ProductColorMapping() {
    }

    public ProductColorMapping(int productId, int colorId) {
        this.productId = productId;
        this.colorId = colorId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }
}

