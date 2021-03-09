package com.programs;
import java.util.Scanner;
public class P14_BreakAndContinue {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Break and Continue using loops
        for (int i=0;i<5;i++){
            System.out.println(i);
            System.out.println("Hello this is iteration in for loop");
            if (i==2)
            {
                System.out.println("Lets break a loop");
                break;
            }
        }

        int x=0;
        while (x<6){
            System.out.println(x);
            System.out.println("Iteration using while loop");
            if (x==3){
                System.out.println("Breaking a while loop");
                break;
            }
            x++;
        }
    }
}
