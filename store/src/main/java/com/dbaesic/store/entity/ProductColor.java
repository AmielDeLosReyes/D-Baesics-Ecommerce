package com.dbaesic.store.entity;

import jakarta.persistence.*;

/**
 * Entity class representing a product color.
 *
 * @author Amiel De Los Reyes
 */
@Entity
@Table(name = "product_color")
public class ProductColor {

    // Primary key for the product color entity
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "color_id")
    private int colorId;

    // Name of the product color
    @Column(name = "color_name", length = 250, nullable = false)
    private String colorName;

    // Constructors, getters, setters, and other methods

    /**
     * Default constructor.
     */
    public ProductColor() {
    }

    /**
     * Parameterized constructor to initialize the product color entity with details.
     *
     * @param colorId   The unique identifier of the product color.
     * @param colorName The name of the product color.
     */
    public ProductColor(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }

    // Getters and setters

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
