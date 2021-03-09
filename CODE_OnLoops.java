package com.programs;
import java.util.Scanner;
public class CODE_OnLoops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /* #1        PRINT
                  *****
                  ****
                  ***
                  **
                  *
            */
        System.out.println("Enter no of rows");
        int r= sc.nextInt();
        int i;
        for (i=r;i>0;i--){
            for (int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        /* #2   Print a table of number */
        System.out.println("Enter a number");
        int no= sc.nextInt();
        System.out.println("The table is");
        for(int x=1;x<=10;x++){
            System.out.println(no+"*"+x+"="+no*x);
        }

        /* #3  Print a Factorial*/
        System.out.println("Enter a no:");
        int number = sc.nextInt();
        int fact=1;
       for(i=1;i<=number;i++){
           fact = fact*i;

       }
        System.out.println(fact);
    }
}
