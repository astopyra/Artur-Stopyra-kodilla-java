package com.kodilla.good.patterns.flightservice;

public class Journey {
    Flight first;
    Flight second;

    public Journey(Flight first, Flight second){
        this.first = first;
        this.second = second;
    }

    public String toString(){
        return "Flight from " + first.getDeparture() + " to " + second.getArrival() + " with stop at " +
                first.getArrival();
    }
}
