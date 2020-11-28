package com.kodilla.good.patterns.food2door.database;

import com.kodilla.good.patterns.food2door.order.Order;

public interface Repository {
    void saveOrder(Order order);
}
