package com.kodilla.testing.shape;

public class Square implements Shape{

    String name = "Square ";
    String field = "The area of a square is equal to (side) × (side) square units";

    public String getShapeName(){
        return name;
    }

    public String getField() {
        return field;
    }
}
