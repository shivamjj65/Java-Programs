package com.programs;
import java.util.Scanner;

public class P11_ElseIfAndSwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //IF ELSE IF
        int age= sc.nextInt();
        if (age>=56){
            System.out.println("you are above 56");
        }
        else if(age>=50)
        {
            System.out.println("you are above 50 but below 56");
        }
        else if(age<=50){
            System.out.println("below 50");
        }

        // SWITCH CASE
        System.out.println("enter age");
        int a= sc.nextInt();
        switch (a){
            case 18:
                System.out.println("You can vote");
                break;
            case 21:
                System.out.println("You can marry");
                break;
            case 60:
                System.out.println("You are going to retire");
                break;
            default:
                System.out.println("Thank you");
        }
    }
}
