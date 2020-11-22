package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

import com.kodilla.good.patterns.food2door.database.Repository;
import com.kodilla.good.patterns.food2door.notification.InformationService;

public class OrderProcessor {
    private final InformationService informationService;
    private final Repository repository;

    public OrderProcessor(InformationService informationService, Repository repository) {
        this.informationService = informationService;
        this.repository = repository;
    }

    public Order execute(final Order order) {
        if (order.getOrderedProducts() != null) {
            informationService.inform(order.getSupplier());
            repository.saveOrdersHistory(order);
            return new Order(order.getSupplier(), order.getOrderedProducts());
        } else {
            return null;
        }
    }
}

