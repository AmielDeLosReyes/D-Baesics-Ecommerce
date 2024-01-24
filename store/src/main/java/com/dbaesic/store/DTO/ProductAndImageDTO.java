package com.dbaesic.store.DTO;

import java.util.List;

public class ProductAndImageDTO {

    private int productId;
    private String productName;
    private int oldPrice;
    private int currentPrice;
    private String productDescription;
    private List<String> imageUrls;

    public ProductAndImageDTO() {
    }

    public ProductAndImageDTO(int productId, String productName, int oldPrice, int currentPrice, String productDescription, String imageUrls) {
        this.productId = productId;
        this.productName = productName;
        this.oldPrice = oldPrice;
        this.currentPrice = currentPrice;
        this.productDescription = productDescription;
        this.imageUrls = List.of(imageUrls.split(","));
    }

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
