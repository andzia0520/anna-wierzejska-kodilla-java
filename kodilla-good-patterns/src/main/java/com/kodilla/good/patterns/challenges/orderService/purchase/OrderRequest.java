package com.kodilla.good.patterns.challenges.orderService.purchase;

import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;
import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;

public class OrderRequest {
    private Customer customer;
    private Product product;

    public OrderRequest(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}

