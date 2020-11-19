package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

import java.util.Map;

public class Connection {
    Departure departure;
    Arrival arrival;

    public Connection(Departure departure, Arrival arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Arrival getArrival() {
        return arrival;
    }
}
