package com.java.Polymorphism;

public class Util{

    public static void print(Shape[] shapes){
        for(Shape shape : shapes){
            shape.display();
        }
    }

    public static double gettotalofArea(Shape[] shapes){
        double total = 0;
        for(Shape shape : shapes){
            total += shape.getArea();
        }
        return total;
    }
}
