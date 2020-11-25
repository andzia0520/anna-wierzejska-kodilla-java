package com.kodilla.good.patterns.food2door.orderProcess;

import com.kodilla.good.patterns.food2door.infoRetrieving.OrderRetriever;
import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class OrderProcessor {

    OrderRetriever orderRetriever;

    public OrderProcessor(OrderRetriever orderRetriever) {
        this.orderRetriever = orderRetriever;
    }

    public List<Supplier> getSupplierList() {
        List<Supplier> supplierList = orderRetriever.retrieve().getOrderedProducts().stream()
                .map(Product::getSupplier)
                .collect(Collectors.toList());

        LinkedHashSet<Supplier> sortedList = new LinkedHashSet<>(supplierList);
        supplierList.clear();
        supplierList.addAll(sortedList);
        return supplierList;
    }

    public Order getOrderFromOneSupplier(Supplier supplier) {
        List<Product> productList = orderRetriever.retrieve().getOrderedProducts().stream()
                .filter(p -> p.getSupplier().equals(supplier))
                .collect(Collectors.toList());
        return new Order(orderRetriever.retrieve().getCustomer(), productList);
    }
}







