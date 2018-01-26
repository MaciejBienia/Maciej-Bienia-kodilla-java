package com.kodilla.exception.test;
import java.util.HashMap;

public class FlightFinder {

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> airports = new HashMap<>();
        airports.put("Schiphol", true);
        airports.put("Heathrow", true);
        airports.put("Tegel", true);
        airports.put("Charles de Gaulle", true);
        airports.put("Okęcie", false);
        airports.put("Stansted", false);
        airports.put("Fiumicino", false);
        airports.put("El Prat", false);

        if(!airports.containsKey(flight.getDepartureAirport()) ||
                !airports.containsKey(flight.getArrivalAirport())) {

            throw new RouteNotFoundException("One or both of the choosen airports haven't been found in our database.");

        }
        if(airports.getOrDefault(flight.getDepartureAirport(), true) &&
                airports.getOrDefault(flight.getArrivalAirport(), true)) {

            System.out.println("Flight has been found!");
            return true;

        } else {

            System.out.println("Choosen flight is not available.");
            return false;

        }
    }
}