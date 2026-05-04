package com.java.Encapsulation;

public class Rectangle {

    private double width;
    private double breadth;

    // Constructor
    /*public Rectangle(double width, double breadth){
        this.width = width;
        this.breadth = breadth;
    }*/

    protected double calculateArea(){
        return breadth * width;
    }

    // Setter
    public void setWidth(double width){
        if(width > 0){
            this.width = width;
        }else{
            throw new IllegalArgumentException("Values of Width must not be less than zero.");
        }
    }
    public void setBreadth(double breadth){
        if(breadth > 0){
            this.breadth = breadth;
        }else{
            throw new IllegalArgumentException("Values of Breadth must not be less than zero.");
        }
    }
}
