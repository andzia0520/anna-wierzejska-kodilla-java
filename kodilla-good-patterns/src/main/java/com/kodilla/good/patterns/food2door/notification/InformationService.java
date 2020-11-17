package com.kodilla.good.patterns.food2door.notification;

import com.kodilla.good.patterns.food2door.order.Order;

public interface InformationService {
    void inform(Order order);
}
