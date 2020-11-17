package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.order.OrderDto;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.database.Repository;
import com.kodilla.good.patterns.food2door.notification.InformationService;

public class OrderProcessor {
    private InformationService informationService;
    private Repository repository;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, Repository repository, OrderService orderService) {
        this.informationService = informationService;
        this.repository = repository;
        this.orderService = orderService;
    }

    public OrderDto process(final Order order) {
        boolean isOrdered = orderService.order(order);
        if (isOrdered) {
            informationService.inform(order);
            repository.saveOrdersHistory(order);
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}

