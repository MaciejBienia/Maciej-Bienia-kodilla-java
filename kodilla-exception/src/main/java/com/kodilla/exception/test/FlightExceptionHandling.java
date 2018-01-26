package com.kodilla.exception.test;

public class FlightExceptionHandling {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(new Flight("Schiphol", "Heathrow"));
            flightFinder.findFlight(new Flight("Okęcie", "Stansted"));
            flightFinder.findFlight(new Flight("Tegel", "Pyrzowice"));
            flightFinder.findFlight(new Flight("Pyrzowice", "Tegel"));

        } catch (RouteNotFoundException e) {

            System.out.println(e);

        } finally {

            System.out.println("\nThanks for using our reservation system!");

        }
    }
}