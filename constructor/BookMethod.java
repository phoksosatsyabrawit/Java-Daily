package com.java.constructor;

import java.util.Scanner;

public class BookMethod {
    // getString
    public static String getString(String label){
        System.out.print(label);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    // getDouble
     public static Double getDouble(String label){
        String price = getString(label);
        return Double.parseDouble(price);
    }
}
