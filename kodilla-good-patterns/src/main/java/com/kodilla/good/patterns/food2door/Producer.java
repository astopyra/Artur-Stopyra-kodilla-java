package com.kodilla.good.patterns.food2door;

import java.util.List;

public interface Producer {
    public boolean process();
    public void getInfoAboutProducer();
    public String getName();
    public List<Product> getProducts();
}
