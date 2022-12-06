package com.kodilla.good.patterns.flightservice;

import java.util.ArrayList;
import java.util.List;

public class FlightDataBase {
    private List<Flight> flights = new ArrayList<Flight>();

    public FlightDataBase() {
        this.flights.add(new Flight("Rzeszow", "Tokyo"));
        this.flights.add(new Flight("Paris", "Rzeszow"));
        this.flights.add(new Flight("London", "Paris"));
        this.flights.add(new Flight("Madrid", "Rzeszow"));
        this.flights.add(new Flight("Rzeszow", "London"));
        this.flights.add(new Flight("Paris", "Madrid"));
        this.flights.add(new Flight("Porto", "London"));
        this.flights.add(new Flight("Madrid", "Porto"));
        this.flights.add(new Flight("London", "Madrid"));
    }

    public List<Flight> getFlights() {
        return flights;
    }
}
