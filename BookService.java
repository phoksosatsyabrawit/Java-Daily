package com.constructor;
import java.util.Scanner;

public class BookService {

    public Book[] createBooks(int n){
        Book[] books = new Book[n];
        for(int i=0; i<n; i++){
           books[i] = createBook();
        }
        return books;
    }

    public Book createBook(){
        //input, title, author, price
        BookMethod bookmethod = new BookMethod();
        String title = bookmethod.getString("Please input Title: ");
        String author = bookmethod.getString("Please input Author: ");
        Double price = bookmethod.getDouble("Please input Price: ");
        Book book = new Book(title, author, price);
        return book;
    }

    public void printBooks(Book[] books){
        System.out.println("============================== # Library # ==============================");
        for(int i=0; i<books.length; i++){
            System.out.println(books[i].toStr());
            //System.out.println("Book: [Title:" + books[i].getTitle() + "] [Author: " + books[i].getAuthor() + "] [Price: " + books[i].getPrice() + "]");
        }
    }
}
