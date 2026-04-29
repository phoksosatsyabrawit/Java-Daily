package com.java.Employee;
import java.util.Scanner;

public class EmployeeUtil {

    public static String getString(String label){
        System.out.print(label);
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }

    public static double getDouble(String label){
        return Double.parseDouble(getString(label));
    }

    public static Gender getenumGender(String label){
        Gender gen = Gender.valueOf(getString(label).trim().toUpperCase()); // Gender.valueof() = Converts String → Enum
        return gen;
    }

    public static Kind getenumKind(String label){
        Kind kind = Kind.valueOf(getString(label).trim().toUpperCase()); // Kind.valueof() = Converts String → Enum
        return kind;
    }
}
