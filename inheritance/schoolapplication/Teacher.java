package com.java.inheritance;

public class Teacher extends Person {
    
    private double salary;

    // Setter
    public void setSalary(double salary){
        this.salary = salary;
    }

    // Getter
    public double getSalary(){
        return salary;
    }
}
