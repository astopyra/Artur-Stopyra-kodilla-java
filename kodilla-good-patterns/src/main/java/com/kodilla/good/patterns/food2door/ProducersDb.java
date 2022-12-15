package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class ProducersDb {

    private List<Producer> listOfProducents;

    public ProducersDb() {
        listOfProducents = new ArrayList<>();
    }

    public void printListOfProducers(){
        System.out.println("\nList of shops:");
        for(Producer producent : listOfProducents){
            System.out.println(producent.getName());
        }
    }

    public void addProducer(Producer producent){
        listOfProducents.add(producent);
    }

    public void removeProducer(Producer producent){
        if(listOfProducents.contains(producent)){
            listOfProducents.remove(producent);
        }
    }

    public List<Producer> getListOfProducents() {
        return listOfProducents;
    }
}
