package com.java.Abstract.animal;

public abstract class Animal {
    protected String name;
    protected int age;

    public void describe(){
        System.out.println("Animal can eat.");
    }

    public abstract void animalSound();
}
