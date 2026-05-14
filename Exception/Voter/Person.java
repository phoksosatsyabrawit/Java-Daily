package com.java.Exception.Voter;
import java.time.LocalDate;

public class Person {
    private long id;
    private String name;
    private Gender gender;
    private LocalDate dateOfBirth;
    private String idCard;

    //Constructor
    public Person(long id, String name, Gender gender, LocalDate dateOfBirth, String idCard){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.idCard = idCard;
    }

    // Getter and Setter
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setGender(Gender gender){
        this.gender = gender;
    }
    public Gender getGender(){
        return gender;
    }
    public void setDateofBirth(LocalDate dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public void setIdCard(String idCard){
        this.idCard = idCard;
    }
    public String getIdCard(){
        return idCard;
    }

    public String toString(){
        return "Person[id=" + id + ", name=" + name + ", gender=" + gender + ", dateOfBirth=" + dateOfBirth + ", idCard=" + idCard + "]";
    }
}
