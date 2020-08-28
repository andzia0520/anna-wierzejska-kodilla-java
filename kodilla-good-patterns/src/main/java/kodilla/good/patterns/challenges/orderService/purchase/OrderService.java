package kodilla.good.patterns.challenges.orderService.purchase;

import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public class OrderService implements PurchaseService {
    @Override
    public boolean buy(final Customer customer, final Product product) {
        System.out.println("Customer: " + customer.getName() + customer.getSurname() + "from " + customer.getAddress() +
                "ordered: " + product.getQuantity() + "psc " + product.getProductName() + product.getPrice() + "$");
        return true;
    }
}
