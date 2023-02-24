package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class ChickenDecorator extends AbstractPizzaOrderDecorator{
    public ChickenDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", chicken";
    }
}
