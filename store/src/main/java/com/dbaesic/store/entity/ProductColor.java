package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product color.
 */
@Entity
@Table(name = "product_color")
public class ProductColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private int colorId;

    @Column(name = "color_name", length = 250, nullable = false)
    private String colorName;

    // Constructors, getters, setters, and other methods

    public ProductColor() {
    }

    public ProductColor(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    public int getColorId() {
        return colorId;
    }

    public void setColorId(int colorId) {
        this.colorId = colorId;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}

