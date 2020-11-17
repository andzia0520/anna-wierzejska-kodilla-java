package com.kodilla.good.patterns.food2door.infoRetrieving;

public class Product {
    private String productName;
    private double price;
    private Supplier supplier;

    public Product(String productName, double price, Supplier supplier) {
        this.productName = productName;
        this.price = price;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
