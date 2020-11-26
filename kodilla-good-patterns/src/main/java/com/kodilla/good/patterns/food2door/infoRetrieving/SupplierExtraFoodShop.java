package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;
import com.kodilla.good.patterns.food2door.order.OrderService;
import com.kodilla.good.patterns.food2door.orderProcess.OrderProcessor;


public class SupplierExtraFoodShop implements Supplier {
    private final String name;
    private final String email;
    OrderService service;


    public SupplierExtraFoodShop(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean process(Order order) {
    System.out.println("Dear " + order.getCustomer().getName() + " " + getName() + " will start to collect your order.");
    return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierExtraFoodShop that = (SupplierExtraFoodShop) o;

        if (!name.equals(that.name)) return false;
        return email.equals(that.email);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + email.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "SupplierExtraFoodShop{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
