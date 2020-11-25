package com.kodilla.good.patterns.food2door.order;

import com.kodilla.good.patterns.food2door.infoRetrieving.Customer;
import com.kodilla.good.patterns.food2door.infoRetrieving.Product;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

import java.util.List;

public class Order {

    private final Customer customer;
    private final List<Product> orderedProducts;

    public Order(Customer customer, List<Product> orderedProducts) {
        this.customer = customer;
        this.orderedProducts = orderedProducts;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getOrderedProducts() {
        return orderedProducts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (!customer.equals(order.customer)) return false;
        return orderedProducts.equals(order.orderedProducts);
    }

    @Override
    public int hashCode() {
        int result = customer.hashCode();
        result = 31 * result + orderedProducts.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customer=" + customer +
                ", orderedProducts=" + orderedProducts +
                '}';
    }
}
