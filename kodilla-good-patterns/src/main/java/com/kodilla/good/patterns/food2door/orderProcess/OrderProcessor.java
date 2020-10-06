package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.order.OrderDto;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.database.Repository;
import com.kodilla.good.patterns.food2door.notification.InformationService;
import com.kodilla.good.patterns.food2door.order.OrderProposal;

public class OrderProcessor {
    private InformationService informationService;
    private Repository repository;
    private OrderService orderService;

    public OrderProcessor(InformationService informationService, Repository repository, OrderService orderService) {
        this.informationService = informationService;
        this.repository = repository;
        this.orderService = orderService;
    }

    public OrderDto process(final OrderProposal orderProposal) {
        boolean isOrdered = orderService.order(orderProposal.getOrder());
        if (isOrdered) {
            informationService.inform(orderProposal.getOrder().getSupplier());
            repository.saveOrdersHistory(orderProposal.getOrder());
            return new OrderDto(orderProposal.getOrder().getSupplier(), true);
        } else {
            return new OrderDto(orderProposal.getOrder().getSupplier(), false);
        }
    }
}

