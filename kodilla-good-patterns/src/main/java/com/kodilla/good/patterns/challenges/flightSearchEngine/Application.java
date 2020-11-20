package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.Db.ConnectionDb;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Arrival;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;
import com.kodilla.good.patterns.challenges.flightSearchEngine.searching.SearchingService;

public class Application {

    public static void main(String[] args) {

        ConnectionDb db = ConnectionDb.getInstance();
        SearchingService searchingService = new SearchingService(db);

        int qtyA = searchingService.findFlightsToCity(new Arrival("Rome")).size();
        int qtyD = searchingService.findFlightsFromCity(new Departure("Warsaw")).size();
        int qty = searchingService.findOneStopFlight(new Departure("Warsaw"), new Arrival("Rio de Janeiro")).size();

        System.out.println(qtyD);
        System.out.println(qtyA);
        System.out.println(qty);
    }
}
