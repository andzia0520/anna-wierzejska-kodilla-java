package com.kodilla.good.patterns.food2door.order;

public class OrdersService implements OrderService{
    @Override
    public boolean order(final Order order) {
        System.out.println("We ordered from " + order.getSupplier().getName() + " following: " +  order.getProduct().getProductName() + " " + order.getQty() + " pcs.");
        return true;
    }
}
