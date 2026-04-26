package com.java.constructor;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BookApp {
    public static void main(String[] args){
        int numberofBooks = 5;
        BookService bookservice = new BookService();
        Book[] books = bookservice.createBooks(numberofBooks);
        bookservice.printBooks(books);
        Arrays.sort(books);
        System.out.println("\n #Sorting by Price.");
        bookservice.printBooks(books);
        System.out.println("\n #Get Amount.");
        double getAmount = bookservice.getAmout(books);
        System.out.println("Total Amount= $" + getAmount);
    }
}
