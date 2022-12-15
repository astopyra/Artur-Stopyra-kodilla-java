package com.kodilla.good.patterns.food2door;

public class ProducersRequestRetriever {

    public ProducersRequest retrieve(){
        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        HealthyShop healthyShop = new HealthyShop();

        return new ProducersRequest(extraFoodShop, glutenFreeShop, healthyShop);
    }
}
