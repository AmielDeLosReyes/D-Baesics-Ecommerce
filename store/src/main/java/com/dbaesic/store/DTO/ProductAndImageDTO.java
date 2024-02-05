package com.dbaesic.store.DTO;

import java.util.List;

/**
 * Data Transfer Object (DTO) representing product information along with image URLs.
 * This class is used to transfer product details between layers of the application.
 *
 * @author Amiel De Los Reyes
 */
public class ProductAndImageDTO {

    private int productId;
    private String productName;
    private int oldPrice;
    private int currentPrice;
    private String productDescription;
    private List<String> imageUrls;

    /**
     * Default constructor.
     */
    public ProductAndImageDTO() {
    }

    /**
     * Parameterized constructor to initialize the DTO with product details.
     *
     * @param productId         The unique identifier of the product.
     * @param productName       The name of the product.
     * @param oldPrice          The old price of the product.
     * @param currentPrice      The current price of the product.
     * @param productDescription The description of the product.
     * @param imageUrls         A comma-separated string of image URLs.
     */
    public ProductAndImageDTO(int productId, String productName, int oldPrice, int currentPrice, String productDescription, String imageUrls) {
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.currentPrice = currentPrice;
        this.productDescription = productDescription;
        // Split the comma-separated string into a List of image URLs
        this.imageUrls = List.of(imageUrls.split(","));
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

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
