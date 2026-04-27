package com.java.inheritance;

public class Student extends Person {
    
    private int grade;

    // Setter
    public void setGrade(int grade){
        this.grade = grade;
    }

    // Getter
    public int getGrade(){
        return grade;
    }
}
