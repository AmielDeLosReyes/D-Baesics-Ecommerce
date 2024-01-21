package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product size.
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

    public ProductSize() {
    }

    public ProductSize(int sizeId, String sizeName) {
        this.sizeId = sizeId;
        this.sizeName = sizeName;
    }

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

