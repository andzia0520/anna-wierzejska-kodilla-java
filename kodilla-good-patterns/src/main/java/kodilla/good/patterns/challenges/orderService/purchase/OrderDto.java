package kodilla.good.patterns.challenges.orderService.purchase;

import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;

public class OrderDto {
    public Customer customer;
    public boolean isBought;

    public OrderDto(Customer customer, boolean isBought) {
        this.customer = customer;
        this.isBought = isBought;
    }
}
