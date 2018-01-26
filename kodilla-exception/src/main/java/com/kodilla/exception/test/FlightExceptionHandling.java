package com.kodilla.exception.test;

public class FlightExceptionHandling {

    public static void main(String[] args) {

        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(new Flight("Schiphol", "Pyrzowice"));

        } catch (RouteNotFoundException e) {

            System.out.println(e);

        } finally {

            System.out.println("\nThanks for using our reservation system!");

        }
    }
}