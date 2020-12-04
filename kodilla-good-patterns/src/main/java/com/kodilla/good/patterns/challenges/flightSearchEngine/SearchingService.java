package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final FlightsDb flightsDb;

    public SearchingService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    private List<FlightSearchResult> findFlightsFromCity(FlightSearchRequest flightSearchRequest) {
        return flightsDb.getFlights().stream()
                .filter(r -> r.getFrom().equals(flightSearchRequest.getDeparture()))
                .map(FlightSearchResult::new)
                .collect(Collectors.toList());
    }

    private List<FlightSearchResult> findFlightsToCity(FlightSearchRequest flightSearchRequest) {
        return flightsDb.getFlights().stream()
                .filter(f -> f.getTo().equals(flightSearchRequest.getArrival()))
                .map(FlightSearchResult::new)
                .collect(toList());
    }

    private List<FlightSearchResult> findConnectingFlight(FlightSearchRequest flightSearchRequest) {
        return flightsDb.getFlights().stream()
                .filter(flight -> flight.getFrom().equals(flightSearchRequest.getDeparture()))
                .flatMap(firstFlight -> flightsDb.getFlights().stream()
                        .filter(flight -> flight.getFrom().equals(firstFlight.getTo()))
                        .filter(flight -> flight.getTo().equals(flightSearchRequest.getArrival()))
                        .map(secondFlight -> new FlightSearchResult(firstFlight, secondFlight)))
                .collect(toList());
    }

    public List<FlightSearchResult> findFlights(FlightSearchRequest flightSearchRequest) {
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

