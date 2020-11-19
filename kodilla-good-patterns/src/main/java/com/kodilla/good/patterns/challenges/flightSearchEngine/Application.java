package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Departure;

public class Application {

    public static void main(String[] args) {

        ConnectionDb db = new ConnectionDb();
        SearchingService searchingService = new SearchingService(db);

        //int qtyA = searchingService.findFlightsToCity().size();
        int qtyD = searchingService.findFlightsFromCity(new Departure("Warsaw")).size();
        //int qty = flightsListToCityViaOtherCity.size();


        System.out.println(qtyD);
        //System.out.println(qtyA);

        //System.out.println(qty);
    }
}
