package com.kodilla.good.patterns.food2door;

public class ProducersRequest {
    private ExtraFoodShop extraFoodShop;
    private GlutenFreeShop glutenFreeShop;
    private HealthyShop healthyShop;

    ProducersDb producersDb = new ProducersDb();

    public ProducersDb getProducersDb() {
        return producersDb;
    }

    public ProducersRequest(ExtraFoodShop extraFoodShop, GlutenFreeShop glutenFreeShop, HealthyShop healthyShop) {
        this.extraFoodShop = extraFoodShop;
        this.glutenFreeShop = glutenFreeShop;
        this.healthyShop = healthyShop;

        addProducersToList();
    }

    public void addProducersToList(){
        producersDb.addProducer(extraFoodShop);
        producersDb.addProducer(glutenFreeShop);
        producersDb.addProducer(healthyShop);
    }

    public ExtraFoodShop getExtraFoodShop() {
        return extraFoodShop;
    }

    public GlutenFreeShop getGlutenFreeShop() {
        return glutenFreeShop;
    }

    public HealthyShop getHealthyShop() {
        return healthyShop;
    }
}
