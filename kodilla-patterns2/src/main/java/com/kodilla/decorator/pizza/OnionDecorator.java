package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class OnionDecorator extends AbstractPizzaOrderDecorator{
    public OnionDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(3));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", onion";
    }
}
