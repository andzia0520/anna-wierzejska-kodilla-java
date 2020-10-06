package com.kodilla.good.patterns.food2door.order;


public class OrderProposal {
    private Order order;

    public OrderProposal(Order order) {
        this.order = order;
    }

    public Order getOrder() {
        return order;
    }
}
