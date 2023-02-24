package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder{

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(15);
    }

    @Override
    public String getDescription() {
        return "Pizza ingredients:\ntomato sauce, cheese";
    }
}
