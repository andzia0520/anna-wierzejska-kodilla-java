package com.kodilla.good.patterns.challenges.orderService;

public class OrderProcessor {
    private InformationService informationService;
    private ProductOrderService productOrderService;
    private OrderRepository orderRepository;

    public OrderProcessor(InformationService informationService, ProductOrderService productOrderService, OrderRepository orderRepository) {
        this.informationService = informationService;
        this.productOrderService = productOrderService;
        this.orderRepository = orderRepository;
    }
    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = productOrderService.buy(orderRequest.getCustomer(), orderRequest.getProduct());
        if(isBought) {
            informationService.inform(orderRequest.getCustomer());
            orderRepository.createTransaction(orderRequest.getCustomer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        }else{
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
