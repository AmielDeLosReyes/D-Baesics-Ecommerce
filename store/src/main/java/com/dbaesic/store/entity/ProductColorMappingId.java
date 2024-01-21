package com.dbaesic.store.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Composite key class representing the ID of a ProductColorMapping entity.
 */
public class ProductColorMappingId implements Serializable {

    private int productId;
    private int colorId;

    // Constructors, equals, hashCode methods, and other methods

    /**
     * Constructs a ProductColorMappingId with specified productId and colorId.
     *
     * @param productId The ID of the product.
     * @param colorId   The ID of the color.
     */
    public ProductColorMappingId(int productId, int colorId) {
        this.productId = productId;
        this.colorId = colorId;
    }

    /**
     * Default constructor.
     */
    public ProductColorMappingId() {
    }

    /**
     * Checks if this ProductColorMappingId is equal to another object.
     *
     * @param o The object to compare.
     * @return True if equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductColorMappingId that = (ProductColorMappingId) o;
        return productId == that.productId && colorId == that.colorId;
    }

    /**
     * Generates a hash code for this ProductColorMappingId.
     *
     * @return The generated hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(productId, colorId);
    }
}
