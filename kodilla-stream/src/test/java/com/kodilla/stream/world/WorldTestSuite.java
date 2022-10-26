package com.kodilla.stream.world;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity(){
        //Given
        Continent europe = new Continent();
        europe.addCountry(new Country("Poland", new BigDecimal("38036118")));
        europe.addCountry(new Country("Spain", new BigDecimal("47326687")));
        europe.addCountry(new Country("Sweden", new BigDecimal("10327789")));

        Continent asia = new Continent();
        asia.addCountry(new Country("Japan", new BigDecimal("125396901")));
        asia.addCountry(new Country("China", new BigDecimal("1411778724")));
        asia.addCountry(new Country("Kazakhstan", new BigDecimal("19186015")));

        Continent africa = new Continent();
        africa.addCountry(new Country("Egypt", new BigDecimal("106437241")));
        africa.addCountry(new Country("South Africa", new BigDecimal("1219090")));
        africa.addCountry(new Country("Nigeria", new BigDecimal("225082083")));

        World world = new World();
        world.addContinent(europe);
        world.addContinent(asia);
        world.addContinent(africa);

        //When
        BigDecimal expextedPeopleQuantity = new BigDecimal("1984790648");
        BigDecimal thePeopleQuantity = world.getPeopleQuantity();

        //Then
        assertEquals(expextedPeopleQuantity, thePeopleQuantity);

    }
}
