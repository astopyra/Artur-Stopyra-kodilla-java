package com.kodilla.good.patterns.food2door;

import java.util.List;

public class AllProducts {
    private List<String> productsList;

    public void addProduct(Product product){
        productsList.add(product.getName());
    }

    public void delProduct(Product product){
        if(productsList.contains(product.getName())){
            productsList.remove(product.getName());
        }
    }
}
