package com.kodilla.decorator.pizza;

import java.math.BigDecimal;

public class BeefDecorator extends AbstractPizzaOrderDecorator{
    protected BeefDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(7));
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", seasoned minced beef";
    }
}
