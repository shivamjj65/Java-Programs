package com.programs;

import java.util.Locale;

public class P08_StringMethods {
    public static void main(String[] args) {
        String name = "shivam";
        System.out.println(name);
        String name1 = new String("Shivam");
        System.out.println(name1);
        System.out.println("String methods are used to operate on java strings");
        System.out.println("various methods to opertae on string: length(), toLowerCase(), toUppercase(), trim()");
        int len = name1.length();
        System.out.println("length of string " +name1+ " is " +len);
        String lowerstring = name1.toLowerCase();
        System.out.println(lowerstring+ " is lowercase of " +name1);

    }
}
