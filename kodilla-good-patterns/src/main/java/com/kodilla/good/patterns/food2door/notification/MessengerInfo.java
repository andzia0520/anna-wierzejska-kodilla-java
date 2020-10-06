package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;

public class MessengerInfo implements InformationService {
    @Override
    public void inform(Supplier supplier) {
        System.out.println("Dear " + supplier.getName() + " we send you this message, because we already placed order in your System.");
    }
}
