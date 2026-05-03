package com.java.Interface.Polygon;

public interface Polygon extends Area, Perimeter {
    
    public void draw();

    default void info(){
        System.out.println("This is default method from Polygon interface");
        test1();
    }

    static void test(){
        System.out.println("Static method from Polygon interface");
    }

    private void test1(){
        System.out.println("test1.");
    }
}
