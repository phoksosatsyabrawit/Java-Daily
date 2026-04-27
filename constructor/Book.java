package com.java.constructor;
import java.util.Scanner;;

public class Book implements Comparable<Book> {
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
        if(title.trim().matches("\\d+")){
            throw new IllegalArgumentException("Title must not be consist only number.");
        }
        String tTitle = title.trim();
        if(!tTitle.trim().matches("[\\p{L}\\s'\\.\\-]+")){
            throw new IllegalArgumentException("Title contain invalid character, only space, ', ., -, are allowed.");
        }
        this.title = title;
    }
    public void setAuthor(String author){
        if(author.trim().matches("\\d+")){
            throw new IllegalArgumentException("Author must not be consist only number.");
        }
        String tAuthor = author.trim();
        if(!tAuthor.trim().matches("[\\p{L}\\s'\\.\\-]+")){
            throw new IllegalArgumentException("Author contain invalid character, only space, ', ., -, are allowed.");
        }
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

    // implement to reuse sort fucntion
    public int compareTo(Book other){
        return (int) (this.getPrice() - other.getPrice()); // by price
        //return this.getTitle().compareTo(other.getTitle()); // by title
    }
}
