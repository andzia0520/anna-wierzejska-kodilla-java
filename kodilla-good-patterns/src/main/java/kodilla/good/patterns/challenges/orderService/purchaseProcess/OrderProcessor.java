package kodilla.good.patterns.challenges.orderService.purchaseProcess;

import kodilla.good.patterns.challenges.orderService.database.OrderRepository;
import kodilla.good.patterns.challenges.orderService.notification.MailService;
import kodilla.good.patterns.challenges.orderService.purchase.OrderDto;
import kodilla.good.patterns.challenges.orderService.purchase.OrderRequest;
import kodilla.good.patterns.challenges.orderService.purchase.OrderService;

public class OrderProcessor {
    private MailService mailService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public OrderProcessor(MailService mailService, OrderService orderService, OrderRepository orderRepository) {
        this.mailService = mailService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.buy(orderRequest.getCustomer(), orderRequest.getProduct());
        if(isBought) {
            mailService.inform(orderRequest.getCustomer());
            orderRepository.createTransaction(orderRequest.getCustomer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
