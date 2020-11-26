package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.FlightsDb;
import com.kodilla.good.patterns.challenges.flightSearchEngine.Flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final FlightsDb flightsDb;
    FlightSearchRequest flightSearchRequest;
    FlightSearchResult flightSearchResult;

    public SearchingService(FlightsDb flightsDb) {
        this.flightsDb = flightsDb;
    }

    public FlightSearchResult findFlights(FlightSearchRequest flightSearchRequest) {

        flightsDb.getFlights().stream()
                .filter(r -> r.getFrom().equals(flightSearchRequest.getDeparture()))
                .collect(toList());



        flightsDb.getFlights().stream()
                .filter(f -> f.getTo().equals(flightSearchRequest.getArrival()))
                .collect(toList());




        flightsDb.getFlights().stream()
                .filter(s -> s.getFrom().equals(flightSearchRequest.getDeparture()))
                .forEach(f -> {
                    flightsDb.getFlights().stream()
                            .filter(s -> s != f)
                            .filter(s -> s.getFrom().equals(f.getTo()))
                            .filter(s -> s.getTo().equals(flightSearchRequest.getArrival()))
                            .forEach(s -> {
                                oneStopFlight.add(s);
                                oneStopFlight.add(f);
                            });
                });
        Collections.reverse(oneStopFlight);
        return oneStopFlight;
    }
}
}


