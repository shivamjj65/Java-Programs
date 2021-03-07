package com.programs;
import java.util.Scanner;

public class P05_Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("String is a class in java, they are immutable and cannot be changed, it is used to store characters or words string is used.To create a string, syntax: String name = new String(''  '')");
        String name = new String("my name is shivam");
        System.out.println(name);
        System.out.println("Or else directly syntax: String name = 'value'");
        //Taking a string as input
        String sn = sc.next();
        System.out.println(sn);
    }
}
