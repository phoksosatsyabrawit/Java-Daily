package com.java.Polymorphism;

public class Circle extends Shape{
    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return Math.PI * r * r;
    }

    @Override
    public String getType(){
        return "Circle";
    }

    @Override
    public void draw(){
        System.out.println("Draw circle.");
    }
}
