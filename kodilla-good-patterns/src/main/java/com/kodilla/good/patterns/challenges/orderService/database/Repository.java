package com.kodilla.good.patterns.challenges.orderService.database;

import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public interface Repository {

    void createTransaction(Customer customer, Product product);
}
