package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

public class Departure {
    String departurePlace;

    public Departure(String departurePlace) {
        this.departurePlace = departurePlace;
    }

    public String getDeparturePlace() {
        return departurePlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Departure departure = (Departure) o;

        return departurePlace.equals(departure.departurePlace);
    }

    @Override
    public int hashCode() {
        return departurePlace.hashCode();
    }
}
