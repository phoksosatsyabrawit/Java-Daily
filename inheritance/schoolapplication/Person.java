package com.java.inheritance.schoolapplication;

public class Person {
    protected String name;
    protected String gender;
    protected int age;

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
}
