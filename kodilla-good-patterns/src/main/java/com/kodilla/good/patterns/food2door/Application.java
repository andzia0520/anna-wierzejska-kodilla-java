package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.database.OrdersRepository;
import com.kodilla.good.patterns.food2door.infoRetrieving.*;
import com.kodilla.good.patterns.food2door.notification.MailInfo;
import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;

public class Application {
    public static void main(String[] args) {

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderProcessor processor = new OrderProcessor();
        Order order = orderRetriever.retrieve();
        OrderService service = new OrderService(new MailInfo(), new OrdersRepository(), processor);
        service.execute(order);
    }
}
