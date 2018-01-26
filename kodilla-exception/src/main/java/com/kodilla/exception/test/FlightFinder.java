package com.kodilla.exception.test;
import java.util.HashMap;

public class FlightFinder {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airports = new HashMap<>();

        if(!airports.containsKey(flight.getDepartureAirport()) ||
                !airports.containsKey(flight.getArrivalAirport())) {

            throw new RouteNotFoundException("One or both of the choosen airports haven't been found in our database.");

        }

        if(airports.getOrDefault(flight.getDepartureAirport(), true) &&
                airports.getOrDefault(flight.getArrivalAirport(), true)) {

            System.out.println("Flight has been found!");

        } else {

            System.out.println("Choosen flight is not available.");

        }
    }
}