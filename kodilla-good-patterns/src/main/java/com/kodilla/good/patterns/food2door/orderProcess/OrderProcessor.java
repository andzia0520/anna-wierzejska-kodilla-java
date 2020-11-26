package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessor {

    private List<Supplier> getSupplierList(Order order) {
        return order.getOrderedProducts().stream()
                .map(Product::getSupplier)
                .distinct()
                .collect(Collectors.toList());
    }

    private boolean orderFromOneSupplier(Order order, Supplier supplier) {
        List<Product> productList = order.getOrderedProducts().stream()
                .filter(p -> p.getSupplier().equals(supplier))
                .collect(Collectors.toList());
        Order o = new Order(order.getCustomer(), productList);
        return supplier.process(o);
    }

    public boolean process(Order order) {
        return getSupplierList(order).stream()
                .map(supplier -> orderFromOneSupplier(order,supplier))
                .reduce(true, (result1 ,result2) -> result1 && result2);

    }
}







