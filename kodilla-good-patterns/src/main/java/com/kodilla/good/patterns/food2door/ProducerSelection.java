package com.kodilla.good.patterns.food2door;

import java.util.Random;

public class ProducerSelection {

    public void displayProducersInfo(ProducersRequest producersRequest){
        producersRequest.getProducersDb().printListOfProducers();
    }

    //losowy wybor producenta
    public Producer selectProducer(ProducersRequest producersRequest){
        System.out.println("\nSelected shop:");
        Random random = new Random();
        return producersRequest.getProducersDb().getListOfProducents().get(random.nextInt(3));
    }
}