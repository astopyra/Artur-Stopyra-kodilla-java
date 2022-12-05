package com.kodilla.good.patterns.challenges;

public class ItemOrderRepository implements OrderRepository {
    @Override
    public void createOrder(Client client, Product product) {
        System.out.println("Saving order details for client: " + client.getName() +
                " buing item: " + product.name());
    }
}
