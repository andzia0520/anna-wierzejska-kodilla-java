package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsNetwork = new HashMap<>();
        flightsNetwork.put("Warsaw", true);
        flightsNetwork.put("Barcelona", false);
        flightsNetwork.put("Madrid", true);
        flightsNetwork.put("Budapest", false);

        if (flightsNetwork.get(flight.getArrivalAirport()) == false) {
            throw new RouteNotFoundException("Your destination airport doesn't exist.");
        } else {
            System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
        }
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Moscow", "Budapest");
        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("Your destination airport doesn't exist.");

        } finally {

            System.out.println("Thank you for using our flights services. See you again !");
        }
    }
}
