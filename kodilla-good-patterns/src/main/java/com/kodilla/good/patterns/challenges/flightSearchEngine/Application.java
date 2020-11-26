package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.List;

public class Application {

    public static void main(String[] args) {

        FlightsDb db = FlightsDb.getInstance();
        SearchingService searchingService = new SearchingService(db);

        /*List<Flight> fromCity = searchingService.findFlightsFromCity("Warsaw");
        List<Flight> toCity = searchingService.findFlightsToCity("Rome");
        List<Flight> withOneStop = searchingService.findOneStopFlight("Warsaw","Rio de Janeiro");
*/
        searchingService.findFlights(new FlightSearchRequest("Warsaw", null, false));
        searchingService.findFlights(new FlightSearchRequest(null, "Rome", false));
        searchingService.findFlights(new FlightSearchRequest("Warsaw", "Rio de Janeiro", true));
    }
}
