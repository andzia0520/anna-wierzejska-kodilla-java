package com.kodilla.good.patterns.challenges.flightSearchEngine;

import java.util.List;

public class FlightSearchResult {
    private List<Flight> flightList;

    public FlightSearchResult(List<Flight> flightList) {
        this.flightList = flightList;
    }

    public List<Flight> getFlightList() {
        return flightList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FlightSearchResult that = (FlightSearchResult) o;

        return flightList.equals(that.flightList);
    }

    @Override
    public int hashCode() {
        return flightList.hashCode();
    }
}
