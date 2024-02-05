package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product image.
 *
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product_image")
public class ProductImage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private int imageId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "image_url", length = 250, nullable = false)
    private String imageUrl;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public ProductImage() {
    }

    /**
     * Parameterized constructor to initialize the product image entity with details.
     *
     * @param imageId   The unique identifier of the product image.
     * @param productId The unique identifier of the associated product.
     * @param imageUrl  The URL of the product image.
     */
    public ProductImage(int imageId, int productId, String imageUrl) {
        this.imageId = imageId;
        this.productId = productId;
        this.imageUrl = imageUrl;
    }

    // Getters and setters

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
