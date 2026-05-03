package com.java.Employee;

public class Employee {
    private int id;
    private String name;
    private Gender gender;
    private double salary;
    private Kind kind;
    public static int count;

    // Constructor
    /*public Employee(String name, double salary){
        this (name,null, salary,null);
    }*/

    // Constructor
    public Employee(String name, Gender gender, double salary, Kind kind){
        super();
        count ++;
        this.id = count;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.kind = kind;
    }

    // Setter
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setKind(Kind kind){
        this.kind = kind;
    }

    // Getter
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public Gender getGender(){
        return gender;
    }
    public Kind getKind(){
        return kind;
    }

    public String toStr(){
        return "Employee: [id: 00" + id + ", name: " + name + ", gender: " + gender + ", salary: $" + salary + ", kind: " + kind + "]";
    }
}
