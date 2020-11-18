package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Connection;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        SearchingService searchingService = new SearchingService();

        Connection connection = new Connection(new HashMap<>());
        searchingService.findConnectionFrom(connection);
        searchingService.findConnectionTo(connection);

    }
}
