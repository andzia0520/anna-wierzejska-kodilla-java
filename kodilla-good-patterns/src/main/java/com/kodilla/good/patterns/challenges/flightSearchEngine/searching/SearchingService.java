package com.kodilla.good.patterns.challenges.flightSearchEngine.searching;

import com.kodilla.good.patterns.challenges.flightSearchEngine.Db.ConnectionDb;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.ConnectingFlight;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Connection;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class SearchingService {

    private final List<Connection> connections;

    public SearchingService(ConnectionDb connectionDb) {
        this.connections = connectionDb.getConnections();
    }

    public List<Connection> findFlightsFromCity(Departure departure) {
        return connections.stream()
                .filter(c -> c.getDeparture().equals(departure))
                .collect(toList());
    }

    public List<Connection> findFlightsToCity(Arrival arrival) {
        return connections.stream()
                .filter(f -> f.getArrival().equals(arrival))
                .collect(toList());
    }

    public List<ConnectingFlight> findOneStopFlight(Departure departure, Arrival arrival) {
        List<ConnectingFlight> oneStopFlights = new ArrayList<>();
        for (Connection start : findFlightsFromCity(departure)) {
            for (Connection end : findFlightsToCity(arrival)) {
                if (start.getArrival().getArrivalPlace().equals(end.getDeparture().getDeparturePlace())) {
                    oneStopFlights.add(new ConnectingFlight(start.getDeparture(), end.getArrival()));
                }
            }
        }
        return oneStopFlights;
    }
}


