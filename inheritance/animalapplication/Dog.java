package com.java.inheritance.animalapplication;

public class Dog extends Animal{

    void displayName(){
        System.out.println("Name: " + name);
    }

    void showInfo(){
        System.out.println("This is a dog.");
    }

    @Override
    void eat(){
        System.out.println("Dog eats dog foods.");
    }

    @Override
    void showName(){
        System.out.println("This dog is name: " + name);
    }

    @Override
    void setName(String name){
        this.name = name + " V1";
    }

    void eatAll(){
        super.eat();
        System.out.println("Eat call from superclass");
        this.eat();
    }
}
