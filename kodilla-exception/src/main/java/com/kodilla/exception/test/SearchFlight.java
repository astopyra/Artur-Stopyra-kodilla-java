package com.kodilla.exception.test;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class SearchFlight {

    public void findFilght(Flight flight) throws RouteNotFoundException{
        Map<String, Boolean> airports = new HashMap<>();
        airports.put("Warsaw", true);
        airports.put("London", true);
        airports.put("Paris", true);
        airports.put("Moscow", false);
        airports.put("Madrid", true);

        if (airports.keySet().contains(flight.getDepartureAirport())
                && airports.keySet().contains(flight.getArrivalAirport())){
            if(airports.get(flight.getDepartureAirport()) && airports.get(flight.getDepartureAirport())){
                System.out.println("Flight from: " + flight.getDepartureAirport() +
                        " to: " + flight.getArrivalAirport() + " exists.");
            } else {
                System.out.println("Flights with given parameters are NOT available at the moment.");
            }
        } else {
            throw new RouteNotFoundException("Given flight does NOT exists!");
        }


    }
}
