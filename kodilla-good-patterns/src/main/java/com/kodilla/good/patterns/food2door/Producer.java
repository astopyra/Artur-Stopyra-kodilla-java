package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;
import java.util.List;

public class Producer {
    private String name;
    private List<Product> products = new ArrayList<>();

    public Producer(final String name){
        this.name = name;
    }



    public void addProduct(Product product){
        products.add(product);
    }



}
