package com.kodilla.good.patterns.challenges.flights;

public class Application {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();
        flightFinder.findFlightsFrom("Katowice");
        flightFinder.findFlightsTo("Kraków");
        flightFinder.findViaFlights("Katowice", "Wrocław", "Gdańsk");
    }
}
