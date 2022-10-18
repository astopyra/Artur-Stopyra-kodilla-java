package com.kodilla.testing.shape;

import java.util.*;

public class ShapeCollector {

    private List<Shape> shapeList = new ArrayList<>();

    public void addFigure(Shape shape){
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape){
        if(shapeList.contains(shape)){
            shapeList.remove(shape);
            return true;
        }else{
            System.out.println("List shapeList does NOT contain object " + shape);
            return false;
        }
    }

    public Shape getFigure(int n){
        if(n<shapeList.size() && n>=0){
            return shapeList.get(n);
        }else {
            return null;
        }
    }

    public String showFigures(){
        String result = "";
        for(Shape thisShape : shapeList){
            result += thisShape.getShapeName();
        }
        return result;
    }
}
