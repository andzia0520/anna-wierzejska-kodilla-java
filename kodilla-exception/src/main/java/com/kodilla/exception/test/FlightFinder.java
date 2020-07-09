package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> flightsNetwork = new HashMap<>();
        flightsNetwork.put("Warsaw", true);
        flightsNetwork.put("Barcelona", false);
        flightsNetwork.put("Madrid", true);
        flightsNetwork.put("Budapest", false);

        if (!flightsNetwork.containsKey(flight.getArrivalAirport())) {
            throw new RouteNotFoundException();
        }

        return flightsNetwork.get(flight.getArrivalAirport());
    }

    public static void main(String[] args) {

        Flight flight = new Flight("Moscow", "Berlin");
        FlightFinder flightFinder = new FlightFinder();

        try {

            if (flightFinder.findFlight(flight)) {
                System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is available.");
            } else {
                System.out.println("The flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is NOT available.");
            }

        } catch (RouteNotFoundException e) {

            System.out.println("Your destination airport doesn't exist.");

        } finally {

            System.out.println("Thank you for using our flights services. See you again !");
        }
    }
}
