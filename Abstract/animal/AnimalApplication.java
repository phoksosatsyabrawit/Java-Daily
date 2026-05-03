package com.java.Abstract.animal;

public class AnimalApplication {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.animalSound();
        dog.describe();
        Cat cat = new Cat();
        cat.animalSound();
        cat.describe();
    }
}
