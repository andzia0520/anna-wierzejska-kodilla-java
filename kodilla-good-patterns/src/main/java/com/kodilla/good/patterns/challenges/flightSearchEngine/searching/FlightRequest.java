package com.kodilla.good.patterns.challenges.flightSearchEngine.searching;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

public class FlightRequest {
    private Departure departure;
    private Arrival arrival;

    public FlightRequest(Departure departure, Arrival arrival) {
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
