package com.java.inheritance.schoolapplication;

public enum Grade {
    FIRST("Freshman"), SECOND("sophomore"), THIRD("Junior"), FORTH("Senior");
    private String value; // stores the passed argument

    // Constructor
    private Grade(String value){ // constructor receives it
        this.value = value;
    }

    public String getValue(){ 
        return value; // lets you retrieve it
    }
}
