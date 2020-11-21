package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

import java.util.Map;

public class Order {
    Supplier supplier;
    Map<Product, Integer> orderedProducts;

    public Order(Supplier supplier, Map<Product, Integer> orderedProducts) {
        this.supplier = supplier;
        this.orderedProducts = orderedProducts;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Map<Product, Integer> getOrderedProducts() {
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
}
