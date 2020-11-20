package com.kodilla.good.patterns.challenges.orderService.purchaseProcess;

import com.kodilla.good.patterns.challenges.orderService.notification.InformationService;
import com.kodilla.good.patterns.challenges.orderService.purchase.OrderDto;
import com.kodilla.good.patterns.challenges.orderService.purchase.OrderRequest;
import com.kodilla.good.patterns.challenges.orderService.purchase.PurchaseService;
import com.kodilla.good.patterns.challenges.orderService.database.Repository;

public class OrderProcessor {
    private InformationService informationService;
    private PurchaseService purchaseService;
    private Repository repository;

    public OrderProcessor(InformationService informationService, PurchaseService purchaseService, Repository repository) {
        this.informationService = informationService;
        this.purchaseService = purchaseService;
        this.repository = repository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = purchaseService.buy(orderRequest.getCustomer(), orderRequest.getProduct());
        if (isBought) {
            informationService.inform(orderRequest.getCustomer());
            repository.createTransaction(orderRequest.getCustomer(), orderRequest.getProduct());
            return new OrderDto(orderRequest.getCustomer(), true);
        } else {
            return new OrderDto(orderRequest.getCustomer(), false);
        }
    }
}
