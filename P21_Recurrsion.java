package com.programs;
import java.util.Scanner;

public class P21_Recurrsion {
    static long factorial(long n){
        if(n==0){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    static void fibonacci(int x,int y,int m){
        int a=x,b=y,c=0;
        if(m>0){
            c = a + b;
            a = b;
            b = c;
            System.out.print(" "+c);
            fibonacci(a,b,m-1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Function calling itself is called recursion");
        System.out.println("example:\n\tfactorial(n) = n * factorial(n-1);");
        System.out.println("Enter a no: ");
        long x = sc.nextLong();
        System.out.println(factorial(x));
        System.out.println("Enter limit for fibonacci series: ");
        int m = sc.nextInt();
        System.out.print("The series is: 0 1");
        fibonacci(0,1,m-2);
    }
}
