package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.database.OrdersRepository;
import com.kodilla.good.patterns.food2door.infoRetrieving.OrderProposalRetriever;
import com.kodilla.good.patterns.food2door.notification.MessengerInfo;
import com.kodilla.good.patterns.food2door.order.OrderProposal;
import com.kodilla.good.patterns.food2door.order.OrdersService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;

public class Application {

    public static void main(String[] args) {

        OrderProposalRetriever orderProposalRetriever = new OrderProposalRetriever();
        OrderProposal orderProposal = orderProposalRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MessengerInfo(), new OrdersRepository(), new OrdersService());
        orderProcessor.process(orderProposal);
    }
}
