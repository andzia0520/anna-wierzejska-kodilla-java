package com.kodilla.good.patterns.food2door.infoRetrieving;

import java.util.List;

public class Supplier {
    String name;
    String address;
    List<Product> productsOffer;

    public Supplier(String name, String address, List<Product> productsOffer) {
        this.name = name;
        this.address = address;
        this.productsOffer = productsOffer;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public List<Product> getProductsOffer() {
        return productsOffer;
    }
}

