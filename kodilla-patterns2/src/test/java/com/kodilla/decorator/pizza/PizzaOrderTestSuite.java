package com.kodilla.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PizzaOrderTestSuite {

    @Test
    void testBasicPizzaChickenBeefPeppersOnionOlivesGetPrice(){
        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ChickenDecorator(pizza);
        pizza = new BeefDecorator(pizza);
        pizza = new PeppersDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new OlivesDecorator(pizza);

        //when
        BigDecimal price = pizza.getPrice();

        //then
        assertEquals(new BigDecimal(36), price);
    }

    @Test
    void testBasicPizzaChickenBeefPeppersOnionOlivesGetDescription(){
        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new ChickenDecorator(pizza);
        pizza = new BeefDecorator(pizza);
        pizza = new PeppersDecorator(pizza);
        pizza = new OnionDecorator(pizza);
        pizza = new OlivesDecorator(pizza);

        //when
        String description = pizza.getDescription();

        //then
        assertEquals("Pizza ingredients:\ntomato sauce, cheese, chicken, " +
                "seasoned minced beef, mixed peppers, onion, olives", description);
    }

    @Test
    void testBasicPizzaOrderGetPrice(){
        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        //when
        BigDecimal price = pizza.getPrice();
        //then
        assertEquals(new BigDecimal(15), price);
    }

    @Test
    void testBasicPizzaOrderGetDexcription(){
        //given
        PizzaOrder pizza = new BasicPizzaOrder();
        //when
        String desciption = pizza.getDescription();
        //then
        assertEquals("Pizza ingredients:\ntomato sauce, cheese", desciption);
    }

}