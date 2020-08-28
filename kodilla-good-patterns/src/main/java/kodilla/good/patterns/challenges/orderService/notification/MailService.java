package kodilla.good.patterns.challenges.orderService.notification;

import kodilla.good.patterns.challenges.orderService.infoRetrieving.Customer;

public class MailService implements InformationService {

    @Override
    public void inform(Customer customer) {
        System.out.println("Dear " + customer.getName() + "you have already placed order in our online shop.");
    }
}
