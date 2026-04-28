package com.java.inheritance.schoolapplication;

public class Student extends Person {
    
    private String grade;

    // Setter
    public void setGrade(String grade){
        this.grade = grade;
    }

    // Getter
    public String getGrade(){
        return grade;
    }

    // Constructor from superclass
    public Student(){
        super("Dara", "Male", 18);
        this.grade = "Junior";
    }

    @Override
    public String toString(){
        return "Student " + super.toString() + " [grade=" + grade + "]";
    }
}
