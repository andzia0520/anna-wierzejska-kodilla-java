package com.kodilla.good.patterns.challenges.flightSearchEngine.infoRetrieving;

public class Connection {
    Departure departure;
    Arrival arrival;

    public Connection(Departure departure, Arrival arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }

    public Departure getDeparture() {
        return departure;
    }

    public Arrival getArrival() {
        return arrival;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Connection that = (Connection) o;

        if (!departure.equals(that.departure)) return false;
        return arrival.equals(that.arrival);
    }

    @Override
    public int hashCode() {
        int result = departure.hashCode();
        result = 31 * result + arrival.hashCode();
        return result;
    }
}
