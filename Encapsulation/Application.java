package com.java.Encapsulation;

public class Application {
    public static void main(String[] args){
        Rectangle rec = new Rectangle();
        rec.setBreadth(3);
        rec.setWidth(5);
        System.out.println("Area of Rectangle: " + rec.calculateArea());
    }
}
