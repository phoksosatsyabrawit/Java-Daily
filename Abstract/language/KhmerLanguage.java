package com.java.Abstract.language;

public class KhmerLanguage extends Language {

    protected String text;

    public KhmerLanguage(){
        this("Hello, world.");
    }

    public KhmerLanguage(String text){
        this.text = text;
    }

    @Override
    void display(){

    }

   @Override
   void greet(){
        System.out.println("Sour sdey");
   }
}
