package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

public class Arrival {
    String arrivalPlace;

    public Arrival(String arrivalPlace) {
        this.arrivalPlace = arrivalPlace;
    }

    public String getArrivalPlace() {
        return arrivalPlace;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Arrival arrival = (Arrival) o;

        return arrivalPlace.equals(arrival.arrivalPlace);
    }

    @Override
    public int hashCode() {
        return arrivalPlace.hashCode();
    }
}
