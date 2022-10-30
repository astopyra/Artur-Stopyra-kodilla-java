package com.kodilla.exception.test;

public class SearchFlightRunner {
    public static void main(String[] args) {
        SearchFlight searchFlight = new SearchFlight();
        Flight flight = new Flight("London", "Moscow");

        try {
            searchFlight.findFilght(flight);
        } catch (RouteNotFoundException e){
            System.out.println("Given flight does NOT exists!");
        }
    }
}
