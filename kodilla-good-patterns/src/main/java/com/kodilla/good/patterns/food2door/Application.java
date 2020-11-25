package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.infoRetrieving.*;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;

public class Application {
    public static void main(String[] args) {


        Supplier extraFoodShop = new SupplierExtraFoodShop("ExtraFoodShop", "extra@gmail.com");
        Supplier healthyShop = new SupplierHealthyShop("Healthy Shop", "healthy@gmail.com");
        Supplier glutenFreeShop = new SupplierGlutenFreeShop("GlutenFree Shop", "gluten@shop.pl");

        OrderRetriever orderRetriever = new OrderRetriever();
        OrderProcessor processor = new OrderProcessor(orderRetriever);
        OrderService service = new OrderService();


       System.out.println(processor.getOrderFromOneSupplier(healthyShop));
        System.out.println(processor.getSupplierList());
    }
}
