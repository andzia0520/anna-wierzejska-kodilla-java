package com.kodilla.good.patterns.challenges.orderService.infoRetrieving;

public class Product {
    private int quantity;
    private String productName;
    private double price;

    public Product(int quantity, String productName, double price) {
        this.quantity = quantity;
        this.productName = productName;
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}
