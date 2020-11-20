package com.kodilla.good.patterns.challenges.flightSearchEngine.Db;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Connection;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

import java.util.ArrayList;
import java.util.List;

public class ConnectionDb {

    private static ConnectionDb connectionDbInstance = null;
    private final List<Connection> connections;

    private ConnectionDb() {

        connections = new ArrayList<>();
        Departure dWarsaw = new Departure("Warsaw");
        Departure dGdansk = new Departure("Gdansk");
        Departure dBerlin = new Departure("Berlin");
        Departure dRome = new Departure("Rome");

        Arrival aRome = new Arrival("Rome");
        Arrival aBerlin = new Arrival("Berlin");
        Arrival aFrankfurt = new Arrival("Frankfurt");
        Arrival aLondon = new Arrival("London");
        Arrival aMoscow = new Arrival("Moscow");
        Arrival aRio = new Arrival("Rio de Janeiro");

        connections.add(new Connection(dWarsaw, aRome));
        connections.add(new Connection(dWarsaw, aBerlin));
        connections.add(new Connection(dWarsaw, aFrankfurt));
        connections.add(new Connection(dWarsaw, aLondon));
        connections.add(new Connection(dGdansk, aRome));
        connections.add(new Connection(dGdansk, aBerlin));
        connections.add(new Connection(dGdansk, aMoscow));
        connections.add(new Connection(dBerlin, aFrankfurt));
        connections.add(new Connection(dRome, aRio));

    }

    public static ConnectionDb getInstance() {
        if (connectionDbInstance == null) {
            connectionDbInstance = new ConnectionDb();
        }
        return connectionDbInstance;
    }

    public List<Connection> getConnections() {
        return connections;
    }
}



