package com.java.Abstract.language;

public class AbstractDemo {
    public static void main(String[] args) {
        //Language language = new Language();
        KhmerLanguage khlang = new KhmerLanguage();
        VietnamLanguage vnlang = new VietnamLanguage();
        BaleiLanguage balei = new BaleiLanguage();
        khlang.greet();
        balei.greet();
        vnlang.greet();
    }   
}
