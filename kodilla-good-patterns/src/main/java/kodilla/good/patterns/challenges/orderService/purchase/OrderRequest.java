package kodilla.good.patterns.challenges.orderService.purchase;

import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public class OrderRequest {
    private Customer customer;
    private Product product;

    public OrderRequest(Customer customer, Product product) {
        this.customer = customer;
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }
}

