package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.database.OrdersRepository;
import com.kodilla.good.patterns.food2door.infoRetrieving.OrderRetriever;
import com.kodilla.good.patterns.food2door.notification.MailInfo;
import com.kodilla.good.patterns.food2door.order.Order;

import com.kodilla.good.patterns.food2door.order.OrdersService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;

public class Application {

    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        Order order = orderRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailInfo(), new OrdersRepository(), new OrdersService());
        orderProcessor.process(order);
    }
}
