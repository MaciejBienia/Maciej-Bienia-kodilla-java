package com.kodilla.good.patterns.challenges.flights;

import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    FlightTable flightTable = new FlightTable();

    public void findFlightsFrom(String departureFrom) {

        System.out.println("\nAll possible flights from " + departureFrom + ":");
        flightTable.flightList().stream()
                .filter(flight -> flight.getDepartureFrom().equals(departureFrom))
                .forEach(System.out::println);
    }

    public void findFlightsTo(String arrivalTo) {

        System.out.println("\nAll possible flights to " + arrivalTo + ":");
        flightTable.flightList().stream()
                .filter(flight -> flight.getArrivalTo().equals(arrivalTo))
                .forEach(System.out::println);
    }

    public void findViaFlights(String departureFrom, String viaAirport, String arrivalTo) {

        List<Flight> departuresToViaList = flightTable.flightList().stream()
                .filter(flight -> flight.getDepartureFrom().equals(departureFrom) &&
                        flight.getArrivalTo().equals(viaAirport))
                .collect(Collectors.toList());

        List<Flight> arrivalFromViaList = flightTable.flightList().stream()
                .filter(flight -> flight.getDepartureFrom().equals(viaAirport) &&
                        flight.getArrivalTo().equals(arrivalTo))
                .collect(Collectors.toList());

        if(departuresToViaList.size() == 0 || arrivalFromViaList.size() == 0) {
            System.out.println("\nNo flights [" + departureFrom + " -> " + arrivalTo + "] via [" + viaAirport +
                    "] available.");
        } else {
            System.out.println("\nProposed flights for travel route [" + departureFrom + " -> " + arrivalTo + "] with " +
                    "choosen via-airport [" + viaAirport + "] are:\n" + departuresToViaList + "\n" + arrivalFromViaList);
        }
    }
}
