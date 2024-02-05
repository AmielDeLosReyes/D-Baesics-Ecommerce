package com.dbaesic.store.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

/**
 * Entity class representing a product.
 *
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product")
public class Product {

    // Primary key for the product entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int productId;

    // Name of the product
    @Column(name = "product_name", length = 250, nullable = false)
    private String productName;

    // Old price of the product
    @Column(name = "old_price")
    private int oldPrice;

    // Current price of the product
    @Column(name = "current_price", nullable = false)
    private int currentPrice;

    // Description of the product
    @Column(name = "product_description", length = 650)
    private String productDescription;

    // Timestamp when the product was created
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // Timestamp when the product was last updated
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public Product() {
    }

    /**
     * Parameterized constructor to initialize the product entity with details.
     *
     * @param productId         The unique identifier of the product.
     * @param productName       The name of the product.
     * @param oldPrice          The old price of the product.
     * @param currentPrice      The current price of the product.
     * @param productDescription The description of the product.
     * @param createdAt         Timestamp when the product was created.
     * @param updatedAt         Timestamp when the product was last updated.
     */
    public Product(int productId, String productName, int oldPrice, int currentPrice, String productDescription, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.currentPrice = currentPrice;
        this.productDescription = productDescription;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    // Getters and setters

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(int oldPrice) {
        this.oldPrice = oldPrice;
    }

    public int getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(int currentPrice) {
        this.currentPrice = currentPrice;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }
}
