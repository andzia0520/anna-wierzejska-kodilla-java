package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Customer;

public interface InformationService {
    void informOrderAccepted(Customer customer);

    void informOrderRejected(Customer customer);
}
