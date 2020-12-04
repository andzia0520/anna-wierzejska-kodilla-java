package com.kodilla.good.patterns.challenges.flightSearchEngine;

public class FlightSearchRequest {
    private final String departure;
    private final String arrival;
    private final boolean connectingFlightsPossible;

    public FlightSearchRequest(String departure, String arrival, boolean connectingFlightsPossible) {
        this.departure = departure;
        this.arrival = arrival;
        this.connectingFlightsPossible = connectingFlightsPossible;
    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public boolean isConnectingFlightsPossible() {
        return connectingFlightsPossible;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSearchRequest that = (FlightSearchRequest) o;

        if (connectingFlightsPossible != that.connectingFlightsPossible) return false;
        if (!departure.equals(that.departure)) return false;
        return arrival.equals(that.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        result = 31 * result + (connectingFlightsPossible ? 1 : 0);
        return result;
    }
}
