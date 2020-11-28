package com.kodilla.good.patterns.challenges.flightSearchEngine;

public class Application {

    public static void main(String[] args) {

        FlightsDb db = FlightsDb.getInstance();
        SearchingService searchingService = new SearchingService(db);

        System.out.println(searchingService.findFlights(new FlightSearchRequest("Warsaw", null, false)));
        System.out.println(searchingService.findFlights(new FlightSearchRequest(null, "Rome", false)));
        System.out.println(searchingService.findFlights(new FlightSearchRequest("Warsaw", "Rio de Janeiro", true)));

    }
}
