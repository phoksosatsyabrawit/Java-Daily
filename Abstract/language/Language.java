package com.java.Abstract.language;

public abstract class Language {

    protected int year;

    public Language(){
        //year = 1200;
        this(1250);
    }
    
    // Constructor
    public Language(int year){
        this.year = year;
    }

    abstract void display();

    abstract void greet();   
    
    void info(){
        //System.out.println("This is a Language class.");
        System.out.println("This language was invented: " + year);
    }
}
