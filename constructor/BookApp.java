package com.java;

public class BookApp {
    public static void main(String[] args){
        int numberofBooks = 2;
        BookService bookservice = new BookService();
        Book[] books = bookservice.createBooks(numberofBooks);
        bookservice.printBooks(books);
    }
}
