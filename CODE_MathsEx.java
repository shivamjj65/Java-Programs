package com.programs;
import java.util.Scanner;

public class CODE_MathsEx {
    public static void main(String[] args) {

        //Encrypting a grade with number
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your grade");
        char G = sc.next().charAt(0);
        char grade = (char)(G+8);
        System.out.println("The encrypted grade is "+grade);

        //evaluating  (x^2 + y^2)
        //           -------------
        //              (b + c)

        System.out.println("Enter x , y , b , c");
        int x,y,b,c;
        x=sc.nextInt();
        y=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        float result;
        result = (float)((x^2)+(y^2))/(b+c);
        System.out.println("the result is "+result);


    }
}
