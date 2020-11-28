package com.kodilla.good.patterns.food2door.database;

import com.kodilla.good.patterns.food2door.order.Order;

public class OrdersRepository implements Repository {
    @Override
    public void saveOrder(Order order) {
        System.out.println(order.getCustomer() + ": " + order.getOrderedProducts() + " ");
    }
}
