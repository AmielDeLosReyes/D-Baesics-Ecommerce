package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product color mapping.
 *
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product_color_mapping")
@IdClass(ProductColorMappingId.class)
public class ProductColorMapping {

    // Composite primary key consisting of product_id and color_id
    @Id
    @Column(name = "product_id")
    private int productId;

    @Id
    @Column(name = "color_id")
    private int colorId;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public ProductColorMapping() {
    }

    /**
     * Parameterized constructor to initialize the product color mapping entity with details.
     *
     * @param productId The unique identifier of the associated product.
     * @param colorId   The unique identifier of the associated color.
     */
    public ProductColorMapping(int productId, int colorId) {
        this.productId = productId;
        this.colorId = colorId;
    }

    // Getters and setters

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
