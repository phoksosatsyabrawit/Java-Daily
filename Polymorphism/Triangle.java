package com.java.Polymorphism;

public class Triangle extends Shape {

    private double a;
    private double b;
    private double c;

    // Constructor
    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea(){
        double s = (a+b+c) / 2;
        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    @Override
    public String getType(){
        return "Triangle";
    }

    @Override
    public void draw(){
        System.out.println("Draw triangle.");
    }
}
