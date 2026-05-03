package com.java.Interface.Polygon;

public class Rectangle implements Polygon{
    private double width;
    private double height;

    public Rectangle(double width, double height){
        super();
        this.width = width;
        this.height = height;
    }

    //Setter
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    } 

    //Getter
    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double getArea(){ // find area of Rectangle
        return width * height;
    }

    @Override
    public double calculatePerimeter(){ //find perimeter of Rectangle
        return (width + height) * 2;
    }

    @Override
    public void draw(){
        System.out.println("Draw rectangle.");
    }

    public String toStr(){
        return "Rectangle [width: " + width + ", height: " + height + ", Area: " + getArea() + "]";
    }

    public String toString(){
        return "Rectangle [width: " + width + ", height: " + height + ", Area: " + calculatePerimeter() + "]";
    }
}
