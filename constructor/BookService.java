package com.java.constructor;
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
        String title = BookMethod.getString("Please input Title: ");
        String author = BookMethod.getString("Please input Author: ");
        Double price = BookMethod.getDouble("Please input Price: ");
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
    
    // bubble sort algorithm
    /*public Book[] sortbyPrice(Book[] books){
        for(int i=0; i<books.length; i++){
            for(int j=i+1; j<books.length; j++){
                if(books[i].getPrice() > books[j].getPrice()){
                    Book temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
        return books;
    }*/

    public double getAmout(Book[] books){
        double amount = 0;
        for(int i=0; i<books.length; i++){
            amount = amount + books[i].getPrice();
            i++;
        }
        return amount;
    }
}
