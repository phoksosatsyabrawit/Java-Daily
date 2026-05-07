package com.java.arrayList;

public class Student {
    private int id;
    private String name;
    private Gender gender;

    //Contructor
    public Student(int id, String name, Gender gender){
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public Student(String name, Gender gender){ // updated
        this.name = name;
        this.gender = gender;
    }

    //Getters and Setters
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Gender getGender(){
        return gender   ; 
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }

    public String toStr(){
        return "[id: 00%d, name: %s, gender: %s]".formatted(getId(), getName(), getGender());
    }
}
