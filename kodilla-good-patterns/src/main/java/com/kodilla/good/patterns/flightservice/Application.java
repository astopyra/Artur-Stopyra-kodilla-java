package com.kodilla.good.patterns.flightservice;

public class Application {
    public static void main(String[] args) {
        FindFlights findFlights = new FindFlights();

        System.out.println("Flights from Rzeszow\n" + findFlights.getFlightsToCity("Rzeszow"));
        System.out.println("Flights to Rzeszow\n" + findFlights.getFlightsFromCity("Rzeszow"));
        System.out.println(findFlights.getFlightsFromTo("Rzeszow", "Paris"));


    }
}
