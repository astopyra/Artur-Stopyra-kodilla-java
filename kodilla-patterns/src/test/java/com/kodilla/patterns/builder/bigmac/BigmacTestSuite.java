package com.kodilla.patterns.builder.bigmac;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BigmacTestSuite {

    @Test
    void testBigmacNew(){
        //given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("bun with sesame seeds")
                .burgers(2)
                .sauce("burger sauce")
                .ingredient("tomato")
                .ingredient("salad")
                .ingredient("onion")
                .ingredient("pickles")
                .build();
        System.out.println(bigmac);

        //when
        int howManyIngredients = bigmac.getIngredients().size();

        //then
        assertEquals(4, howManyIngredients);
    }
}
