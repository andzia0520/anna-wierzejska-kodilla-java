package com.kodilla.good.patterns.challenges.flightSearchEngine;

import com.kodilla.good.patterns.challenges.flightSearchEngine.Db.FlightsDb;
import com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving.Flight;
import com.kodilla.good.patterns.challenges.flightSearchEngine.searching.SearchingService;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightsDb db = FlightsDb.getInstance();
        SearchingService searchingService = new SearchingService(db);

        List<Flight> fromCity = searchingService.findFlightsFromCity("Warsaw");
        List<Flight> toCity = searchingService.findFlightsToCity("Rome");
        List<Flight> withOneStop = searchingService.findOneStopFlight("Warsaw","Rio de Janeiro");

        System.out.println(fromCity);
        System.out.println(toCity);
        System.out.println(withOneStop);
    }
}
