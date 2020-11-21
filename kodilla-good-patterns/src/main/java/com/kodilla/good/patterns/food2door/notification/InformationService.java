package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.infoRetrieving.Supplier;
import com.kodilla.good.patterns.food2door.order.Order;

public interface InformationService {
    void inform(Supplier supplier);
}
