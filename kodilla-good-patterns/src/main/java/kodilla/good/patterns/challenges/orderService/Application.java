package kodilla.good.patterns.challenges.orderService;

import kodilla.good.patterns.challenges.orderService.database.OrderRepository;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.OrderRequestRetriever;
import kodilla.good.patterns.challenges.orderService.notification.MailService;
import kodilla.good.patterns.challenges.orderService.purchase.OrderRequest;
import kodilla.good.patterns.challenges.orderService.purchase.OrderService;
import kodilla.good.patterns.challenges.orderService.purchaseProcess.OrderProcessor;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new MailService(), new OrderService(),
                new OrderRepository());
        orderProcessor.process(orderRequest);
    }
}
