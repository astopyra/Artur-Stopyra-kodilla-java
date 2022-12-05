package com.kodilla.good.patterns.challenges;

public class Watch implements Product {
    String name;

    public Watch(String name){
        this.name = name;
    }

    @Override
    public String name() {
        return name;
    }


}
