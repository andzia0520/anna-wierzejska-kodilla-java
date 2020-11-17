package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

public class MailInfo implements InformationService {

    @Override
    public void inform(Order order) {

        /*String supplier = order.getOrderedProducts().keySet().stream()
                .map(Product::getSupplier)
                .map(Supplier::getName)
                .toString();

        String product = order.getOrderedProducts().keySet().stream()
                .map(Product::getProductName)
                .toString();*/

        String supplier = order.getOrderedProducts().stream()
                .map(Product::getSupplier)
                .map(Supplier::getName)
                .toString();

        String product = order.getOrderedProducts().stream()
                .map(Product::getProductName)
                .toString();
        System.out.println("Dear " + supplier + " we send you this Email, because we already placed order in your System.");
    }
}
