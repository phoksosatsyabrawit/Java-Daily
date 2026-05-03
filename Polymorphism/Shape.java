package com.java.Polymorphism;

public abstract class Shape implements Comparable<Shape> {

    abstract double getArea();
    abstract String getType();

    public void display(){
        System.out.println("Shape [Type: " + getType() + ", Area: " + getArea() + "]");
    }

    @Override
    public int compareTo(Shape other){
        return (int) (this.getArea() - other.getArea());
    }

    public void draw(){
        System.out.println("Draw shape.");
    }
}
