package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

import java.util.List;

public class ConnectingFlight {

    Departure departure;
    Arrival arrival;
    List<Connection> connectingFlights;

    public ConnectingFlight(Departure departure, Arrival arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectingFlight that = (ConnectingFlight) o;

        return connectingFlights.equals(that.connectingFlights);
    }

    @Override
    public int hashCode() {
        return connectingFlights.hashCode();
    }
}
