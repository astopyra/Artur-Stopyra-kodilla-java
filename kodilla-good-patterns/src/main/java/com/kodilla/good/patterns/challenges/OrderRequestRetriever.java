package com.kodilla.good.patterns.challenges;

public class OrderRequestRetriever {
    public OrderRequest retrieve(){
        Client client = new Client("Jan Nowak", "jnowak@wp.pl");
        Product watch = new Watch("Rolex");

        return new OrderRequest(client, watch);
    }
}
