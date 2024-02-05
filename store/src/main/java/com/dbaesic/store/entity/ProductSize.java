package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product size.
 *
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product_size")
public class ProductSize {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "size_id")
    private int sizeId;

    @Column(name = "size_name", length = 250, nullable = false)
    private String sizeName;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public ProductSize() {
    }

    /**
     * Parameterized constructor to initialize the product size entity with details.
     *
     * @param sizeId   The unique identifier of the product size.
     * @param sizeName The name of the product size.
     */
    public ProductSize(int sizeId, String sizeName) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
    }

    // Getters and setters

    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}
