package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Order {

    List<Product> orderedProducts;

    public Order(List<Product> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    /*Map<Product, Integer> orderedProducts;

    public Order(Map<Product, Integer> orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }*/
}
