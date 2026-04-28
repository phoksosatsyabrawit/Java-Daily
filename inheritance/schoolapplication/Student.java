package com.java.inheritance.schoolapplication;

public class Student extends Person {
    
    private Grade grade;

    // Setter
    public void setGrade(Grade grade){
        this.grade = grade;
    }

    // Getter
    public Grade getGrade(){
        return grade;
    }

    // Constructor from superclass
    public Student(){
        super("Dara", Gender.MALE, 18);
    }

    @Override
    public String toString(){
        return "Student " + super.toString() + " [grade=" + Grade.THIRD.getValue() + "]";
    }
}
