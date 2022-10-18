package com.kodilla.testing.shape;

public class Circle implements Shape {
    String name = "Circle ";
    String field = "The area of circle is equal pi times the radius squared";

    public String getShapeName() {
        return name;
    }

    public String getField() {
        return field;
    }
}