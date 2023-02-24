package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class PeppersDecorator extends AbstractPizzaOrderDecorator{
    protected PeppersDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", mixed peppers";
    }
}
