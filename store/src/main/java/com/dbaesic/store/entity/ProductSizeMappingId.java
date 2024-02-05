package com.dbaesic.store.entity;

import java.io.Serializable;
import java.util.Objects;

/**
 * Composite key class representing the ID of a ProductSizeMapping entity.
 *
 * @author Amiel De Los Reyes
 */
public class ProductSizeMappingId implements Serializable {

    private int productId;
    private int sizeId;

    // Constructors, equals, hashCode methods, and other methods

    /**
     * Constructs a ProductSizeMappingId with specified productId and sizeId.
     *
     * @param productId The ID of the product.
     * @param sizeId    The ID of the size.
     */
    public ProductSizeMappingId(int productId, int sizeId) {
        this.productId = productId;
        this.sizeId = sizeId;
    }

    /**
     * Default constructor.
     */
    public ProductSizeMappingId() {
    }

    /**
     * Checks if this ProductSizeMappingId is equal to another object.
     *
     * @param o The object to compare.
     * @return True if equal, false otherwise.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductSizeMappingId that = (ProductSizeMappingId) o;
        return productId == that.productId && sizeId == that.sizeId;
    }

    /**
     * Generates a hash code for this ProductSizeMappingId.
     *
     * @return The generated hash code.
     */
    @Override
    public int hashCode() {
        return Objects.hash(productId, sizeId);
    }
}
