package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.order.OrderDto;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.database.Repository;
import com.kodilla.good.patterns.food2door.notification.InformationService;

public class OrderProcessor {
    private final InformationService informationService;
    private final Repository repository;
    private final OrderService orderService;

    public OrderProcessor(InformationService informationService, Repository repository, OrderService orderService) {
        this.informationService = informationService;
        this.repository = repository;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.order(order.getSupplier());
        if (isOrdered) {
            informationService.inform(order.getSupplier());
            repository.saveOrdersHistory(order);
            return new OrderDto(order.getSupplier(), true);
        } else {
            return new OrderDto(order.getSupplier(), false);
        }
    }
}

