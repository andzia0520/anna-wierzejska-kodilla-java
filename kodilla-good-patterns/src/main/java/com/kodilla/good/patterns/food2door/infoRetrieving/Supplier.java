package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;

public interface Supplier {
    boolean process(Order order);

}
