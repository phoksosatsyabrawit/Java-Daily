package com.java.Polymorphism;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){
        /*Shape shape = new Shape();
        shape.draw();

        Circle circle = new Circle();
        circle.draw();
        circle.draw(3.0);*/

        Util util = new Util();

        //Polymorphism Variable
        Shape[] shape = new Shape[] {
            new Circle(3),
            new Rectangle(2,4),
            new Triangle(3,5,7)
        };
        util.print(shape);
        System.out.println("Total Area: " + util.gettotalofArea(shape));
        Arrays.sort(shape);
        System.out.println("#Sorting by Area.");
        util.print(shape);
    }
}
