package com.java.inheritance.animalapplication;

import java.text.Annotation;

public class Application {
    public static void main(String[] args){
        Animal animal = new Animal();
        //animal.name = "wang cai";
        //animal.eat();
        //animal.showName();
        

        Dog dog = new Dog();
        //dog.setName("letty");
        //dog.showInfo();
        dog.eatAll();
        //dog.showName();
    }
}
