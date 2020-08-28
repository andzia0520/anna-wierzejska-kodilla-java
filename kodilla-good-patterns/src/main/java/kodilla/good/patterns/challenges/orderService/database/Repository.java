package kodilla.good.patterns.challenges.orderService.database;


import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public interface Repository {

    void createTransaction(Customer customer, Product product);
}

