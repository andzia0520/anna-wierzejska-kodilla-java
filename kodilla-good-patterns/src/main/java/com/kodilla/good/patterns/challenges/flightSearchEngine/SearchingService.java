package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.*;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final FlightsDb flightsDb;

    public SearchingService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    private List<Flight> findFlightsFromCity(FlightSearchRequest flightSearchRequest) {
        return flightsDb.getFlights().stream()
                .filter(r -> r.getFrom().equals(flightSearchRequest.getDeparture()))
                .collect(toList());
    }


    private List<Flight> findFlightsToCity(FlightSearchRequest flightSearchRequest) {
       return flightsDb.getFlights().stream()
                .filter(f -> f.getTo().equals(flightSearchRequest.getArrival()))
                .collect(toList());

    }

    private List<Flight> findConnectingFlight(FlightSearchRequest flightSearchRequest) {
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
        return oneStopFlight;
    }


    public List<Flight> findFlights(FlightSearchRequest flightSearchRequest) {
        if (flightSearchRequest.getArrival() == null && !flightSearchRequest.isConnectingFlightsPossible()) {
            return findFlightsFromCity(flightSearchRequest);
        } else if (flightSearchRequest.getDeparture() == null && !flightSearchRequest.isConnectingFlightsPossible()) {
            return findFlightsToCity(flightSearchRequest);
        } else if (flightSearchRequest.isConnectingFlightsPossible()) {
            return findConnectingFlight(flightSearchRequest);
        }
        return new ArrayList<>();
    }

}

