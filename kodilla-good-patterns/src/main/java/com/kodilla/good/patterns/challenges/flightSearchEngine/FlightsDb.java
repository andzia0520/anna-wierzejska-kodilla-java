package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.ArrayList;
import java.util.List;

public class FlightsDb {

    private static final FlightsDb instance = new FlightsDb();
    private final List<Flight> flights;

    private FlightsDb() {

        flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "Rome", "LOT", "001"));
        flights.add(new Flight("Warsaw", "Berlin", "Lufthansa", "002"));
        flights.add(new Flight("Warsaw", "Frankfurt", "LOT", "003"));
        flights.add(new Flight("Warsaw", "London", "LOT", "004"));
        flights.add(new Flight("Gdansk", "Rome", "LOT", "005"));
        flights.add(new Flight("Gdansk", "Berlin", "LOT", "006"));
        flights.add(new Flight("Gdansk", "Moscow", "LOT", "007"));
        flights.add(new Flight("Berlin", "Rio de Janeiro", "Lufthansa", "008"));
        flights.add(new Flight("Rome", "Rio de Janeiro", "Lufthansa", "009"));
    }

    public static FlightsDb getInstance() {
        return instance;
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}



