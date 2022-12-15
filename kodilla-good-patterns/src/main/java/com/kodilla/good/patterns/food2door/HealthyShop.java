package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class HealthyShop implements Producer{

    private String name = "Healthy Shop";
    private List<Product> products = new ArrayList<>(Arrays.asList(new Product("Carrot", 10),
            new Product("Potatoes", 10)));

    @Override
    public boolean process() {
        boolean orderCompleted;
        Product product = selectProduct();

        if(products.contains(product)){
            System.out.println("Preparing items to deliver");
            System.out.println("Arranging delivery");
            System.out.println("Sending products out");
            orderCompleted = true;
        }else {
            orderCompleted = false;
            System.out.println("Order can not be completed.");
        }
        return orderCompleted;
    }

    //losowy wybor produktu
    public Product selectProduct(){
        Random rand = new Random();
        return products.get(rand.nextInt(2));
    }

    @Override
    public void getInfoAboutProducer() {
        System.out.println(name + "\nList of products:");
        for(Product product : products){
            System.out.println(product.getName() + "  quantity: " + product.getQuantity());
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Product> getProducts() {
        return products;
    }
}
