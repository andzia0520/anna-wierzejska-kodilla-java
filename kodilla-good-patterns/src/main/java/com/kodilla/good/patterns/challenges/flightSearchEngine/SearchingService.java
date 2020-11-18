package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Connection;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.ConnectionRequestRetriever;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingService {

    public boolean findConnectionFrom(Connection connection) {
       List<String> departuresList = connection.getConnections().keySet().stream()
               .map(Departure::getDeparturePlace)
               .collect(Collectors.toList());

       return true;
    }

    public boolean findConnectionTo(Connection connection) {
        List<String> arrivalsList = connection.getConnections().values().stream()
                .map(Arrival::getArrivalPlace)
                .collect(Collectors.toList());

        return true;
    }


}
