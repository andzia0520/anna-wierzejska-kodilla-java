package com.kodilla.good.patterns.food2door.infoRetrieving;

public class Product {
    private final String productName;
    private final double price;
    private final Supplier supplier;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (Double.compare(product.price, price) != 0) return false;
        if (!productName.equals(product.productName)) return false;
        return supplier.equals(product.supplier);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productName.hashCode();
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
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
