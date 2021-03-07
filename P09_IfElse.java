package com.programs;
import java.util.Scanner;

public class P09_IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("you can vote");
        }
        else{
            System.out.println("you cannot vote");
        }

        boolean a = true;
        boolean b = false;
        if ( a==true && b==true){
            System.out.println("a and b is true");
        }
        else if (a==true | b==true)
        {
            System.out.println("a is true and b cant say");
        }
    }
}
