package com.kodilla.good.patterns.challenges.flightSearchEngine.searching;

import com.kodilla.good.patterns.challenges.flightSearchEngine.Db.FlightsDb;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Flight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final List<Flight> flights;

    public SearchingService(FlightsDb flightsDb) {
        this.flights = flightsDb.getFlights();
    }

    public List<Flight> findFlightsFromCity(String departure) {
        return flights.stream()
                .filter(c -> c.getDeparture().equals(departure))
                .collect(toList());
    }

    public List<Flight> findFlightsToCity(String arrival) {
        return flights.stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(toList());
    }

    public List<Flight> findOneStopFlight(String departure, String arrival) {
        List<Flight> oneStopFlight = new ArrayList<>();
        flights.stream()
                .filter(f -> f.getDeparture().equals(departure))
                .forEach(f -> {
                    flights.stream()
                            .filter(s -> s != f)
                            .filter(s -> s.getDeparture().equals(f.getArrival()))
                            .filter(s -> s.getArrival().equals(arrival))
                            .forEach(s -> {
                                oneStopFlight.add(s);
                                oneStopFlight.add(f);
                            });
                });
        Collections.reverse(oneStopFlight);
        return oneStopFlight;
    }
}


