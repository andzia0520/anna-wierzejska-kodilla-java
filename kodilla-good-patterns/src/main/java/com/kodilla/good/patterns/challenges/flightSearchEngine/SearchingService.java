package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final FlightsDb flightsDb;

    public SearchingService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    public FlightSearchResult findFlights(FlightSearchRequest flightSearchRequest) {
        if (flightSearchRequest.getArrival() == null && !flightSearchRequest.isConnectingFlightsPossible()) {
            return new FlightSearchResult(flightsDb.getFlights().stream()
                    .filter(r -> r.getFrom().equals(flightSearchRequest.getDeparture()))
                    .collect(toList()));
        } else if (flightSearchRequest.getDeparture() == null && !flightSearchRequest.isConnectingFlightsPossible()) {
            return new FlightSearchResult(flightsDb.getFlights().stream()
                    .filter(f -> f.getTo().equals(flightSearchRequest.getArrival()))
                    .collect(toList()));

        } else if (flightSearchRequest.isConnectingFlightsPossible()) {
            List<Flight> oneStopFlight = new ArrayList<>();
            flightsDb.getFlights().stream()
                    .filter(f -> f.getFrom().equals(flightSearchRequest.getDeparture()))
                    .forEach(s -> {
                        flightsDb.getFlights().stream()
                                .filter(f -> f != s)
                                .filter(f -> f.getFrom().equals(s.getTo()))
                                .filter(f -> f.getTo().equals(flightSearchRequest.getArrival()))
                                .forEach(f -> {
                                    oneStopFlight.add(s);
                                    oneStopFlight.add(f);
                                });
                    });
            return new FlightSearchResult(oneStopFlight);
        }
        return new FlightSearchResult(new ArrayList<>());
    }
}



