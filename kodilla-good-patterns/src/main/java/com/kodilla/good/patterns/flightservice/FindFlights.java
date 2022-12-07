package com.kodilla.good.patterns.flightservice;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindFlights {

    final private FlightDataBase flightDataBase = new FlightDataBase();

    public List<Flight> getFlightsToCity(String city){

        return flightDataBase.getFlights().stream()
                .filter(flight -> flight.getArrival()==city)
                .collect(Collectors.toList());
    }

    public List<Flight> getFlightsFromCity(String city){

        return flightDataBase.getFlights().stream()
                .filter(flight -> flight.getDeparture()==city)
                .collect(Collectors.toList());
    }

    public List<Journey> getFlightsFromTo(String departureCity, String arrivalCity ){
        System.out.println("\ninterchange flight");

        List<Flight> starting = getFlightsFromCity(departureCity);
        List<Flight> ending = getFlightsToCity(arrivalCity);
        List<Journey> results = new ArrayList<Journey>();

        for (Flight first : starting){
            for (Flight second : ending){
                if(first.getArrival().equals(second.getDeparture())){
                    results.add(new Journey(first, second));
                }
            }
        }
        return results;
    }

}
