package com.constructor;
import java.util.Scanner;;

public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor
    public Book(String title, String author, double price){
        super();
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Setter
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPrice(double price){
        this.price = price;
    }

    // Getter
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public double getPrice(){
        return price;
    }

    // toStr
    public String toStr(){
        return "Book: [Title:" + title + "] [Author: " + author + "] [Price: $" + price + "]";
    }
}
