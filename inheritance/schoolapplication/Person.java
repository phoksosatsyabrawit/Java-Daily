package com.java.inheritance.schoolapplication;

public class Person {
    protected String name;
    protected Gender gender;
    protected int age;
    protected String nationality = "Cambodia";

    // Constructor with no-arg
    public Person(){}

    // Constructor with other-arg
    public Person(String name, Gender gender, Grade grade){ 
        this(name, gender,0);
    }

    // Constructor with arg
    public Person(String name, Gender gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // Setter
    public void setName(String name){
        this.name = name;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public void setAge(int age){
        this.age = age;
    }

    // Getter
    public String getName(){
        return name;
    }
    public Gender getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "[name=" + name + "; gender=" + gender + "; age=" + age + "]";
    }

    public void showInfo(){
        System.out.println("This is from person class.");
    }
}
