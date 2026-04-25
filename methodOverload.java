package com.methodoverload;
import java.util.Arrays;
import java.lang.String;

public class methodOverload {

    public static void main(String[] args){
        print("Hello, world.");
        print(2026);
        print("Coke", 2);
        int[] a = new int[] {3,5,7,9,11};
        print(Arrays.toString(a));
        
        printvarArg(3,5,7,9,11);
        printvarArg("phok.sosatsyabravit, ", "bill.gate, ", "steve.job, ","mark.zuckaberg");
        printvarArg("Coke: ", 2.3,1.2,2.2,1.3,1.5);
    }

    public static void print(String text){
        System.out.println(text);
    }
    public static void print(int number){
        System.out.println(number);
    }
    public static void print(String property, double price){
        System.out.println(property + "= $" + price);
    }
    public static void print(int[] numbers){
        for(int n : numbers){
            System.out.println(n);
        }
    }

    // var args
    public static void printvarArg(String... names){
        System.out.print("Name: ");
        for(String name : names){
            System.out.print(name);
        }
        System.out.println();
    }
    public static void printvarArg(int... numbers){
        for(int n : numbers){
            System.out.println(n);
        }
    }
    public static void printvarArg(String property, double... prices){
        System.out.print(property);
        for(double n : prices){
            System.out.print(n + ", ");
        }
    }
}
