package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

import java.util.Map;

public class Connection {
    Map<Departure, Arrival> connections;

    public Connection(Map<Departure, Arrival> connections) {
        this.connections = connections;
    }

    public Map<Departure, Arrival> getConnections() {
        return connections;
    }
}
