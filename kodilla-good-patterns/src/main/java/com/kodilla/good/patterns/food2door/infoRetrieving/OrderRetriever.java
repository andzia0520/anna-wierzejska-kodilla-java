/*
package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRetriever {
    public Order retrieve() {
        Supplier extraFoodShop = new Supplier("ExtraFoodShop", "Warsaw");
        Supplier healthyShop = new Supplier("Healthy Shop", "Lodz");
        Supplier glutenFreeShop = new Supplier("GlutenFree Shop", "Gdansk");

        Product bread = new Product("bread", 3.2, extraFoodShop);
        Product sausage = new Product("sausage", 25.50, healthyShop);
        Product butter = new Product("butter", 4.35, glutenFreeShop);
        Product milk = new Product("milk", 2.35, glutenFreeShop);
        Product wholemealBread = new Product("wholemeal bread", 4.35, extraFoodShop);
        Product flour = new Product("flour", 2.95, healthyShop);

        Map<Product, Integer> orderedProducts = new HashMap<>();
        orderedProducts.put(bread, 3);
        orderedProducts.put(sausage, 7);
        orderedProducts.put(butter, 1);
        orderedProducts.put(milk, 4);
        orderedProducts.put(wholemealBread, 3);
        orderedProducts.put(flour, 2);


        Map<Supplier, Map<Product, Integer>> full = new HashMap<>();
        ccc.put(extraFoodShop, orderedProducts);
        ccc.put(healthyShop, orderedProducts);
        ccc.put(glutenFreeShop, orderedProducts);

        return new Order(extraFoodShop, );
    }
}
*/
