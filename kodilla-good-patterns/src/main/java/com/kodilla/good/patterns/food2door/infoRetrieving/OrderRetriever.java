package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;

import java.util.*;

public class OrderRetriever {

    public Order retrieve() {

        Customer customer = new Customer("Helmut", "helmut@helmut");

        Supplier extraFoodShop = new SupplierExtraFoodShop("ExtraFoodShop", "extra@gmail.com");
        Supplier healthyShop = new SupplierHealthyShop("Healthy Shop", "healthy@gmail.com");
        Supplier glutenFreeShop = new SupplierGlutenFreeShop("GlutenFree Shop", "gluten@shop.pl");

        Product bread = new Product("bread", 3.2, extraFoodShop);
        Product sausage = new Product("sausage", 25.50, healthyShop);
        Product butter = new Product("butter", 4.35, glutenFreeShop);
        Product milk = new Product("milk", 2.35, glutenFreeShop);
        Product wholemealBread = new Product("wholemeal bread", 4.35, extraFoodShop);
        Product flour = new Product("flour", 2.95, healthyShop);

        List<Product> orderedProducts = new ArrayList<>();
        Collections.addAll(orderedProducts, bread, sausage, butter, milk, wholemealBread, flour);

        return new Order(customer, orderedProducts);
    }
}
