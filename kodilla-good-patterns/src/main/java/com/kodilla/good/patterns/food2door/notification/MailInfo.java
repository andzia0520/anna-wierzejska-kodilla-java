package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Customer;
import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

public class MailInfo implements InformationService {

    @Override
    public void inform(Customer customer) {

        System.out.println("Dear " + customer.getName() + " thank you for your order.");
    }
}
