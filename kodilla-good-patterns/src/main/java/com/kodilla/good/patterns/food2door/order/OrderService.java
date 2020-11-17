package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;

import java.util.List;
import java.util.Map;

public interface OrderService {
    //Map<Product, Integer> order(final Order order);

    boolean order(final Order order);
}
