package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class Continent {

    private final List<Country> countries = new ArrayList<>();

    public void addCountry(Country country){ countries.add(country); }

    public boolean removeCountry(Country country){ return countries.remove(country); }



    public List<Country> getCountries() {
        return countries;
    }


}
