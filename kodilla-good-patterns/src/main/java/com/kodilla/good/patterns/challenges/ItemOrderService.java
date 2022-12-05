package com.kodilla.good.patterns.challenges;

public class ItemOrderService implements OrderService {
    @Override
    public boolean order(Client client, Product product) {
        if(product.name() != "") {
            System.out.println("Product " + product.name() + " is available");
            return true;
        } else{
            System.out.println("Product is unavailable");
            return false;
        }
    }
}
