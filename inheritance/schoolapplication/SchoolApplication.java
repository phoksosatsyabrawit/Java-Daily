package com.java.inheritance.schoolapplication;

public class SchoolApplication {
    public static void main(String[] args){
        Teacher teacher = new Teacher();
        Student student = new Student();

        //System.out.println(teacher.toString());
        //System.out.println(student.toString());
        teacher.displayNationality();
    }
}
