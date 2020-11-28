package com.kodilla.good.patterns.food2door.infoRetrieving;

import java.math.BigDecimal;

public class Product {
    private final String productName;
    private final BigDecimal price;
    private final Supplier supplier;

    public Product(String productName, BigDecimal price, Supplier supplier) {
        this.productName = productName;
        this.price = price;
        this.supplier = supplier;
    }

    public String getProductName() {
        return productName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!productName.equals(product.productName)) return false;
        if (!price.equals(product.price)) return false;
        return supplier.equals(product.supplier);
    }

    @Override
    public int hashCode() {
        int result = productName.hashCode();
        result = 31 * result + price.hashCode();
        result = 31 * result + supplier.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                ", supplier=" + supplier +
                '}';
    }
}
