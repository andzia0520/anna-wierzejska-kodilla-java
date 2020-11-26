package com.kodilla.good.patterns.food2door.infoRetrieving;

import com.kodilla.good.patterns.food2door.order.Order;

public class SupplierHealthyShop implements Supplier {
    private final String name;
    private final String email;

    public SupplierHealthyShop(String name, String email) {
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
        System.out.println("Dear " + order.getCustomer().getName() +" We received order from you. Your " + getName());
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SupplierHealthyShop that = (SupplierHealthyShop) o;

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
        return "SupplierHealthyShop{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
