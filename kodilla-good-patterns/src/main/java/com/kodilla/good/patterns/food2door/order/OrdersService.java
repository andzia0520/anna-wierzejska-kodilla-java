/*
package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.OrderRetriever;
import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

import java.util.Map;
import java.util.stream.Collectors;

public class OrdersService implements OrderService {

    OrderRetriever orderRetriever;
    @Override
    public boolean order(Supplier supplier) {
        orderRetriever.retrieve().entrySet().stream()
                .filter(entry -> entry.getKey().getSupplier().equals(supplier))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
           return true;
    }
}
*/
