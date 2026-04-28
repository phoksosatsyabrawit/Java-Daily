package com.java.inheritance.schoolapplication;

public class Teacher extends Person {
    private double salary;
    private String nationality = "Vietnam";

    // Setter
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Getter
    public double getSalary(){
        return salary;
    }

    // Constructor from superclass
    public Teacher(){
        super("Thida", "female",30);
        this.salary = 200;
    }

    @Override
    public String toString(){
        return "Teacher " + super.toString() + " [salary=$" + salary + "]";
    }

    public void displayNationality(){
        System.out.println(super.nationality);
    }
}
