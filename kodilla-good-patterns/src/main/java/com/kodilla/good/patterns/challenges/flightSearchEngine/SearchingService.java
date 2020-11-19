package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Connection;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

import java.util.List;
import java.util.stream.Collectors;

public class SearchingService {

    private  final List<Connection> connections;

    public SearchingService(ConnectionDb connectionDb) {
        this.connections = connectionDb.getConnections();
    }

    public List<Connection> findFlightsFromCity(Departure departure) {
        return connections.stream()
                .filter(c -> c.getDeparture().equals(departure))
                .collect(Collectors.toList());

    }

/*
    public List<Departure> findFlightsToCity(Connection connection) {
        List<Departure> flightsListToCity = connections.stream()
                .filter(f -> connection.getArrival().equals(connection.getArrival()))
                .map(Connection::getDeparture)
                .collect(toList());
        return flightsListToCity;
    }
*/


}
