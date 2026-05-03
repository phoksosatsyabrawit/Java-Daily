package com.java.Interface.Polygon;

public class PolygonApplication {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(4,5);
        //double areaofRec = rectangle.getArea();
        //System.out.println("Area of Rectangle = " + areaofRec);
        System.out.println(rectangle.toStr());
        System.out.println(rectangle.toString());
        rectangle.info();
        Polygon.test();

        /*Triangle triangle = new Triangle(3, 4, 5);
        System.out.println(triangle.toStr());
        System.out.println(triangle.toString());*/
    }
}
