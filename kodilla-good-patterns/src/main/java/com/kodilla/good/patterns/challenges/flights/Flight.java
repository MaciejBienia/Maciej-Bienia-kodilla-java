package com.kodilla.good.patterns.challenges.flights;

public class Flight {
    private String departureFrom;
    private String arrivalTo;

    public Flight(String departureFrom, String arrivalTo) {
        this.departureFrom = departureFrom;
        this.arrivalTo = arrivalTo;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getArrivalTo() {
        return arrivalTo;
    }

    @Override
    public String toString() {
        return "[" + departureFrom + " -> " + arrivalTo + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flight)) return false;

        Flight flight = (Flight) o;

        if (!departureFrom.equals(flight.departureFrom)) return false;
        return arrivalTo.equals(flight.arrivalTo);
    }

    @Override
    public int hashCode() {
        int result = departureFrom.hashCode();
        result = 31 * result + arrivalTo.hashCode();
        return result;
    }
}
