package com.kodilla.good.patterns.challenges.orderService.infoRetrieving;

import com.kodilla.good.patterns.challenges.orderService.purchase.OrderRequest;

public class OrderRequestRetriever {
    public OrderRequest retrieve() {
        Customer customer = new Customer("John ", "Wayne ", "New York ");
        Product product = new Product(3, "toothbrush ", 3.5);

        return new OrderRequest(customer, product);
    }
}
