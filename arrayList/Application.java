package com.java.arrayList;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
        School school = new School("PSB codding school");
        Student student1 = new Student(1, "Elliot", Gender.M);
        Student student2 = new Student(2, "Darlene", Gender.F);
        Student student3 = new Student(3, "Angela", Gender.F);
        school.registerStudent(student1);
        school.registerStudent(student2);
        school.registerStudent(student3);
        school.display();
        System.out.println("----------------------------- Finding Student by ID -----------------------------");
        Student findStubyId = school.findStudentbyId(2);
        System.out.println(findStubyId.toStr());
        System.out.println("----------------------------- Sorting by Name -----------------------------");
        school.sortbyName();
        school.display();
        System.out.println("----------------------------- Sorting by ID -----------------------------");
        school.sortbyId();
        school.display();
        System.out.println("----------------------------- Searching Student by Name-----------------------------");
        Student findStu = school.searchStudentbyName("Elliot");
        System.out.println(findStu.toStr());
        System.out.println("----------------------------- Updating Student -----------------------------");
        school.updateStudent(1, new Student("Updated Elliot", Gender.M));
        school.display();
        System.out.println("----------------------------- Removing Student -----------------------------");
        school.removeStudentV2(3);
        school.display();
    }
}
