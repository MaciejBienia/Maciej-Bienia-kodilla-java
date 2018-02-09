package com.kodilla.good.patterns.challenges.flights;
import java.util.*;

public class FlightTable {

    public List<Flight> flightList() {

        List<Flight> flightTable = new ArrayList<>();
        flightTable.add(new Flight("Katowice", "Wrocław"));
        flightTable.add(new Flight("Katowice", "Warszawa"));
        flightTable.add(new Flight("Kraków", "Poznań"));
        flightTable.add(new Flight("Kraków", "Wrocław"));
        flightTable.add(new Flight("Wrocław", "Gdańsk"));
        flightTable.add(new Flight("Gdańsk", "Kraków"));
        flightTable.add(new Flight("Wrocław", "Katowice"));
        flightTable.add(new Flight("Warszawa", "Katowice"));
        flightTable.add(new Flight("Poznań", "Kraków"));
        flightTable.add(new Flight("Wrocław", "Kraków"));
        flightTable.add(new Flight("Gdańsk", "Wrocław"));
        flightTable.add(new Flight("Kraków", "Gdańsk"));

        return flightTable;
    }
}