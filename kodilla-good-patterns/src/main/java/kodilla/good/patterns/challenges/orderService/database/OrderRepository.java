package kodilla.good.patterns.challenges.orderService.database;


import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public class OrderRepository implements Repository {

    @Override
    public void createTransaction(Customer customer, Product product) {
        System.out.println("Transaction of: " + customer.getName() + customer.getSurname() + "from " + customer.getAddress() + ": " + product.getQuantity() + "psc " + product.getProductName() + product.getPrice() + "$");
    }
}
