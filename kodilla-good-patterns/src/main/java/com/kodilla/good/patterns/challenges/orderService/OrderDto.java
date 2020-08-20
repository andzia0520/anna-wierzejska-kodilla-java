package com.kodilla.good.patterns.challenges.orderService;

public class OrderDto {
    public Customer customer;
    public boolean isBought;

    public OrderDto(Customer customer, boolean isBought) {
        this.customer = customer;
        this.isBought = isBought;
    }

    public Customer getCustomer() {
        return customer;
    }

    public boolean isBought() {
        return isBought;
    }
}
