package com.kodilla.good.patterns.challenges.orderService;

public class ProductOrderService {
    public boolean buy(final Customer customer, final Product product) {
        System.out.println("Customer" + customer.getName() + customer.getSurname() + customer.getAdress() +
                "ordered: " + product.getQuantity() + "psc " + product.getProductName() + product.getPrice());
        return true;
    }
}
