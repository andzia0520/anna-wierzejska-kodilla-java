package com.kodilla.good.patterns.challenges.orderService;

public class OrderRepository {

    public void createTransaction(Customer customer, Product product) {
        System.out.println("Transaction of " + customer + ": " + product);
    }
}
