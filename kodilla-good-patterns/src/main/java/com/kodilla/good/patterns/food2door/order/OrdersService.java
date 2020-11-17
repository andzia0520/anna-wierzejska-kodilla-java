package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.OrderRetriever;
import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdersService implements OrderService {

    OrderRetriever orderRetriever;
    @Override
    public boolean order(Order order) {
   /*      List<Product> orderFromOneSupplier= order.getOrderedProducts().stream()
                .map(Product::getSupplier)
                .filter(s -> s.getName().equals(""))
                .collect(Collectors.toList());*/

        return true;
    }


    /*@Override
    public Map<Product, Integer> order(final Order order) {

        *//*String supplier = order.getOrderedProducts().keySet().stream()
                .map(Product::getSupplier)
                .map(Supplier::getName)
                .toString();

        String product = order.getOrderedProducts().keySet().stream()
                .map(Product::getProductName)
                .toString();
*//*
        Map<Product, Integer> orderFromOneSupplier = order.getOrderedProducts().keySet().stream()
                .map(Product::getSupplier)
                .filter(s -> s.getName().equals("ExtraFoodShop"))
                .collect(Collectors.toMap(product ->));


        *//*System.out.println("We ordered from " + supplier + " following: " + product + " " + " pcs.");*//*
        return orderFromOneSupplier;
    }*/
}
