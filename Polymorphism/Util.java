package com.java.Polymorphism;

public class Util{

    public void print(Shape[] shapes){
        for(Shape shape : shapes){
            shape.display();
        }
    }

    public double gettotalofArea(Shape[] shapes){
        double total = 0;
        for(Shape shape : shapes){
            total += shape.getArea();
        }
        return total;
    }
}
