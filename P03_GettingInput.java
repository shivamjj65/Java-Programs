package com.programs;
import java.util.Scanner;
public class P03_GettingInput {
    public static void main(String[] args) {
        System.out.println("To take users input java has a scanner class ie; import java.util.scanner; ");
        System.out.println("refer code");
        Scanner sc = new Scanner(System.in);
        System.out.println("This is the way scanner class is implemented");
        System.out.println("Scanner sc = new Scanner(System.in);");
        System.out.println("sc is variable of Scanner, System.in means take input from keyboard");
        System.out.println("Enter a 2 numbers");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= a+b;
        System.out.println("Addition is "+c);

    }
}
