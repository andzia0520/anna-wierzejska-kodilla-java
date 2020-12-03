package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.ArrayList;
import java.util.List;

public class FlightSearchResult {
    private final List<Flight> flights = new ArrayList<>();

    public FlightSearchResult(Flight directFlight) {
        flights.add(directFlight);
    }

    public FlightSearchResult(Flight firstFlight, Flight secondFlight) {
        flights.add(firstFlight);
        flights.add(secondFlight);
    }

    @Override
    public String toString() {
        return flights.toString();
    }
}
