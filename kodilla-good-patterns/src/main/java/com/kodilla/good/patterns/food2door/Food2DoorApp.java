package com.kodilla.good.patterns.food2door;

public class Food2DoorApp {
    public static void main(String[] args) {

        ProducersRequestRetriever producersRequestRetriever = new ProducersRequestRetriever();
        ProducersRequest producersRequest = producersRequestRetriever.retrieve();

        OrderProcessor orderProcessor = new OrderProcessor(new ProducerSelection(), new EMailService());
        orderProcessor.process(producersRequest);


    }
}
