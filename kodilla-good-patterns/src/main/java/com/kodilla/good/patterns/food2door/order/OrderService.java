package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.database.Repository;
import com.kodilla.good.patterns.food2door.notification.InformationService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;

public class OrderService {

    private InformationService informationService;
    private Repository repository;
    OrderProcessor processor;

    public OrderService(InformationService informationService, Repository repository, OrderProcessor processor) {
        this.informationService = informationService;
        this.repository = repository;
        this.processor = processor;
    }

    public void execute(Order order) {
        if (processor.process(order)) {
            informationService.informOrderAccepted(order.getCustomer());
            repository.saveOrdersHistory(order);

        } else {
            informationService.informOrderRejected(order.getCustomer());
        }
    }
}




