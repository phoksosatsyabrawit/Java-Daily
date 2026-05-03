package com.java.Interface.Polygon;

public class Triangle implements Area, Perimeter{
    private double angleA;
    private double angleB;
    private double angleC;

    //Constructor
    public Triangle(double angleA, double angleB, double angleC){
        super();
        this.angleA = angleA;
        this.angleB = angleB;
        this.angleC = angleC;
    }

    //Setter
    public void setangleA(double angleA){
        this.angleA = angleA;
    }
    public void setangleB(double angleB){
        this.angleB = angleB;
    }
    public void setangleC(double angleC){
        this.angleC = angleC;
    }

    //Getter
    public double getangleA(){
        return angleA;
    }
    public double getangleB(){
        return angleB;
    }
    public double getangleC(){
        return angleC;
    }

    //implement method getArea of Triagnle
    public double getArea(){ //find area of Triangle use semi-perimeter
        double p = calculatePerimeter()/2;
        return Math.sqrt(p*(p-angleA)*(p-angleB)*(p-angleC));
    }

    //implement method getArea of Triagnle
    public double calculatePerimeter(){ //find perimeter of Triangle
        return angleA + angleB + angleC;
    }

    public String toStr(){
        return "Triangle [angleA: " + angleA + ", angleB: " + angleB + ", angleC: " + angleC + ", Area: " + getArea() + "]";
    }

    public String toString(){
        return "Triangle [angleA: " + angleA + ", angleB: " + angleB + ", angleC: " + angleC + ", perimeter: " + calculatePerimeter() + "]";
    }
}
