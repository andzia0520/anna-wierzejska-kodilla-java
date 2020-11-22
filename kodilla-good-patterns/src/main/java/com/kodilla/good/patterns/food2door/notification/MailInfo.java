package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

public class MailInfo implements InformationService {

    @Override
    public void inform(Supplier supplier) {

        System.out.println("Dear " + supplier.getName() + " we send you this Email, because we already placed order in your System.");
    }
}
