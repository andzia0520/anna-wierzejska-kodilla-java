package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ConnectionRequestRetriever {

    public Connection retrieve() {

        Departure dWarsaw = new Departure("Warsaw");
        Departure dGdansk = new Departure("Gdansk");
        Departure dMoscow = new Departure("Moscow");
        Departure dBerlin = new Departure("Berlin");
        Departure dRome = new Departure("Rome");

        Arrival aRome = new Arrival("Rome");
        Arrival aBerlin = new Arrival("Berlin");
        Arrival aFrankfurt = new Arrival("Frankfurt");
        Arrival aLondon = new Arrival("London");
        Arrival aMoscow = new Arrival("Moscow");
        Arrival aRio = new Arrival("Rio de Janeiro");
        Arrival aChicago = new Arrival("Chicago");


        Map<Departure, Arrival> connections = new HashMap<>();
        connections.put(dWarsaw, aRome);
        connections.put(dWarsaw, aBerlin);
        connections.put(dWarsaw, aFrankfurt);
        connections.put(dWarsaw, aLondon);
        connections.put(dGdansk, aRome);
        connections.put(dGdansk, aBerlin);
        connections.put(dGdansk, aMoscow);
        connections.put(dMoscow, aBerlin);
        connections.put(dBerlin, aRio);
        connections.put(dRome, aChicago);

        return new Connection(connections);
    }
}
