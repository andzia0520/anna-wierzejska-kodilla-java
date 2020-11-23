package com.kodilla.good.patterns.challenges.flightSearchEngine.Db;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Flight;

import java.util.ArrayList;
import java.util.List;

public class FlightsDb {

    private static FlightsDb flightsDbInstance = null;
    private final List<Flight> flights;

    private FlightsDb() {

        flights = new ArrayList<>();

        flights.add(new Flight("Warsaw", "Rome"));
        flights.add(new Flight("Warsaw", "Berlin"));
        flights.add(new Flight("Warsaw", "Frankfurt"));
        flights.add(new Flight("Warsaw", "London"));
        flights.add(new Flight("Gdansk", "Rome"));
        flights.add(new Flight("Gdansk", "Berlin"));
        flights.add(new Flight("Gdansk", "Moscow"));
        flights.add(new Flight("Berlin", "Rio de Janeiro"));
        flights.add(new Flight("Rome", "Rio de Janeiro"));
    }

    public static FlightsDb getInstance() {
        if (flightsDbInstance == null) {
            synchronized (FlightsDb.class) {
                if (flightsDbInstance == null) {
                    flightsDbInstance = new FlightsDb();
                }
            }
        }
        return flightsDbInstance;
    }

    public List<Flight> getFlights() {
        return new ArrayList<>(flights);
    }
}



