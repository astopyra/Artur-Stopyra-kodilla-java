package com.kodilla.good.patterns.food2door;

public class OrderProcessor {

    InformationService informationService;
    ProducerSelection producerSelection;
    Producer producer;

    public OrderProcessor(ProducerSelection producerSelection, InformationService informationService){
        this.producerSelection = producerSelection;
        this.informationService = informationService;
    }

    public void process(ProducersRequest producersRequest){
        producerSelection.displayProducersInfo(producersRequest);
        producer = producerSelection.selectProducer(producersRequest);
        //all products from shop
        producer.getInfoAboutProducer();
        //process in shop
        if(producer.process()){
            informationService.inform();
        }
    }

}
