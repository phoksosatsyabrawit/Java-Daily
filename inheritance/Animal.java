package com.java.inheritance;

public class Animal {
     protected String name;

     void setName(String name){
        this.name = name;
     }
     void eat(){
        System.out.println("Animal can eat.");
     }
     void showName(){
        System.out.println("Dog name: " + name);
     }
}
