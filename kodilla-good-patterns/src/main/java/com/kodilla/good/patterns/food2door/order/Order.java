package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

public class Order {
    Supplier supplier;
    Product product;
    int qty;

    public Order(Supplier supplier, Product product, int qty) {
        this.supplier = supplier;
        this.product = product;
        this.qty = qty;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public Product getProduct() {
        return product;
    }

    public int getQty() {
        return qty;
    }
}
