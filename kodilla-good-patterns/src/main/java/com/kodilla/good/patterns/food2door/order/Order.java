package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

import java.util.List;

public class Order {
    private final Supplier supplier;
    private final List<Product> orderedProducts;

    public Order(Supplier supplier, List<Product> orderedProducts) {
        this.supplier = supplier;
        this.orderedProducts = orderedProducts;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (!supplier.equals(order.supplier)) return false;
        return orderedProducts.equals(order.orderedProducts);
    }

    @Override
    public int hashCode() {
        int result = supplier.hashCode();
        result = 31 * result + orderedProducts.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "supplier=" + supplier +
                ", orderedProducts=" + orderedProducts +
                '}';
    }
}
