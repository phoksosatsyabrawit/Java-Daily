package com.java.arrayList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class School {
    private String name;
    private ArrayList<Student> students = new ArrayList<>();

    //Constructor
    public School(String name){
        this.name = name;
    }

    // Getter and Setter
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Student findStudentbyId(int id){
        for(Student student : students){
            if(student.getId() == id){
               return student;
            }
        }
        return null;
    }

    public Student searchStudentbyName(String name){ // updated
        for(Student student : students){
            if(student.getName().equals(name)){
                return student;
            }
        }
        return null;
    }

    public void registerStudent(Student student){ // correct
        students.add(student);
    } 
    
    // removing method V1
    public void removeStudentV1(int studentId){ // updated
        for(Student student : students){
            if(student.getId() == studentId){
                students.remove(student);
            }
        }
    }

    // removing method V2
    public void removeStudentV2(int studentId){ // new method
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getId() == studentId){
                iterator.remove();
            }
        }
    }

    public void sortbyName(){
        Comparator<Student> compareAsc = new Comparator<Student>(){ // updated
            @Override
            public int compare(Student s1, Student s2){
                return s1.getName().compareTo(s2.getName());
            }
        };
        students.sort(compareAsc);
    }

    public void sortbyId(){
        Comparator<Student> compareAsc = new Comparator<Student>(){
            @Override
            public int compare(Student s1, Student s2){
                return s1.getId() - s2.getId();
            }
        };
        students.sort(compareAsc);
    }

    public void updateStudent(int studentId, Student newStudent){ // updated
        Student student = findStudentbyId(studentId);
        if(student != null){
            student.setGender(newStudent.getGender());
            student.setName(newStudent.getName());
        } else {
            System.out.println("Student not found.");
        }
    }

    public void display(){
        for(Student student : students){
            System.out.println(getName() + ", Student: " + student.toStr());
        }
    }
}
