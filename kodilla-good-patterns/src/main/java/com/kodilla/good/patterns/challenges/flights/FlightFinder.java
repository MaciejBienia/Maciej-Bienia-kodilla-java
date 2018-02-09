package com.kodilla.good.patterns.challenges.flights;
import java.util.List;
import java.util.stream.Collectors;

public class FlightFinder {

    public void findFlightsFrom(String departureFrom) {

        System.out.println("\nAll possible flights from " + departureFrom + ":");
        FlightTable flightTable = new FlightTable();
        flightTable.flightList().stream()
                .filter(flight -> flight.getDepartureFrom().equals(departureFrom))
                .forEach(System.out::println);
    }

    public void findFlightsTo(String arrivalTo) {

        System.out.println("\nAll possible flights to " + arrivalTo + ":");
        FlightTable flightTable = new FlightTable();
        flightTable.flightList().stream()
                .filter(flight -> flight.getArrivalTo().equals(arrivalTo))
                .forEach(System.out::println);
    }

    public void findViaFlights(String departureFrom, String arrivalTo) {
        FlightTable flightTable = new FlightTable();

        List<Flight> departuresList = flightTable.flightList().stream()
                .filter(flight -> flight.getDepartureFrom().equals(departureFrom))
                .collect(Collectors.toList());

        List<Flight> arrivalsList = flightTable.flightList().stream()
                .filter(flight -> flight.getArrivalTo().equals(arrivalTo))
                .collect(Collectors.toList());

        for(Flight firstFlight: departuresList) {
            String viaAirport = firstFlight.getArrivalTo();
            for(Flight secondFlight: arrivalsList) {
                if(viaAirport.equals(secondFlight.getDepartureFrom())) {
                    System.out.println("\nYou have choosen the flight [" + departureFrom + " -> " + arrivalTo +
                            "]\nDirect flight is not available, but you can travel in the way below: \n" +
                            firstFlight + "\n" + secondFlight);
                }
            }
        }
    }
}
