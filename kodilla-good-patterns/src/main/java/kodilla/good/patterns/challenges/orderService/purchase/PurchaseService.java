package kodilla.good.patterns.challenges.orderService.purchase;

import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;
import kodilla.good.patterns.challenges.orderService.infoRetrieving.Product;

public interface PurchaseService {

    boolean buy(final Customer customer, final Product product);
}


