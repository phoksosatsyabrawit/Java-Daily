package com.java.inheritance.schoolapplication;

public class Person {
    protected String name;
    protected String gender;
    protected int age;
    protected String nationality = "Cambodia";

    // Constructor with no-arg
    public Person(){}

    // Constructor with other-arg
    public Person(String name, String gender){ 
        this(name, gender,0);
    }

    // Constructor with param
    public Person(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Getter
    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "[name=" + name + "; gender=" + gender + "; age=" + age + "]";
    }
}
