package com.kodilla.good.patterns.challenges.orderService;

import com.kodilla.good.patterns.challenges.orderService.database.OrderRepository;
import com.kodilla.good.patterns.challenges.orderService.purchaseProcess.OrderProcessor;
import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.OrderRequestRetriever;
import com.kodilla.good.patterns.challenges.orderService.notification.MailService;
import com.kodilla.good.patterns.challenges.orderService.purchase.OrderRequest;
import com.kodilla.good.patterns.challenges.orderService.purchase.OrderService;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(),
                new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}