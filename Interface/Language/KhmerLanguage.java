package com.java.Interface.Language;

public class KhmerLanguage implements Language {

    @Override
    public void greeting(){
        System.out.println("Sou sdey");
    }
    
    @Override
    public void introduce(String name){
        System.out.println("My name is: " + name);
    }
}
