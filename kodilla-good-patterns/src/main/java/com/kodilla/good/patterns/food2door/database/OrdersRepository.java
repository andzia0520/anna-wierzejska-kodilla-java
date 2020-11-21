package com.kodilla.good.patterns.food2door.database;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

import java.util.stream.Collectors;

public class OrdersRepository implements Repository {
    @Override
    public void saveOrdersHistory(Order order) {
        String supplier = order.getOrderedProducts().keySet().stream()
                .map(Product::getSupplier)
                .map(Supplier::getName)
                .toString();

        String product = order.getOrderedProducts().keySet().stream()
                .map(Product::getProductName)
                .toString();

        System.out.println(supplier + " " + product + " " );
    }
}
