package com.kodilla.good.patterns.challenges.orderService.purchase;

import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import com.kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public interface PurchaseService {

    boolean buy(final Customer customer, final Product product);
}


