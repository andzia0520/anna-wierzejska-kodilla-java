package com.kodilla.good.patterns.challenges.flightSearchEngine;

public class Flight {
    private final String from;
    private final String to;
    private final String airline;
    private final String flightNumber;

    public Flight(String from, String to, String airline, String flightNumber) {
        this.from = from;
        this.to = to;
        this.airline = airline;
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public String getAirline() {
        return airline;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!from.equals(flight.from)) return false;
        if (!to.equals(flight.to)) return false;
        if (!airline.equals(flight.airline)) return false;
        return flightNumber.equals(flight.flightNumber);
    }

    @Override
    public int hashCode() {
        int result = from.hashCode();
        result = 31 * result + to.hashCode();
        result = 31 * result + airline.hashCode();
        result = 31 * result + flightNumber.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", airline='" + airline + '\'' +
                ", flightNumber='" + flightNumber + '\'' +
                '}';
    }
}
