package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderProcessor {

    private List<Supplier> getSupplierList(Order order) {
        return order.getOrderedProducts().keySet().stream()
                .map(Product::getSupplier)
                .distinct()
                .collect(Collectors.toList());
    }

    private boolean orderFromOneSupplier(Order order, Supplier supplier) {
        Map<Product, Integer> productList = order.getOrderedProducts().entrySet().stream()
                .filter(entry -> entry.getKey().getSupplier().equals(supplier))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Order singleOrder = new Order(order.getCustomer(), productList);
        return supplier.process(singleOrder);
    }

    public boolean process(Order order) {
        return getSupplierList(order).stream()
                .map(supplier -> orderFromOneSupplier(order, supplier))
                .reduce(true, (result1, result2) -> result1 && result2);
    }
}







