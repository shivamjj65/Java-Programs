package com.programs;

import java.util.Scanner;

public class CODE_Methods {

    //method to print a table
    static void table(int no){
        for (int i=1;i<=10;i++) {
            System.out.println(no+"*"+i+"="+no*i);
        }
    }

    //method to print sum of n natural numbers using recursion
    static int recursum(int n){
       int sum=0;
        // sum(n) = 1 + 2 + 3 + 4 + ... + n
        // sum(n) = 1 + 2 + 3 + 4 + ... + n-2 + n-1 + n
        // sum(n) = sum(n-1)numbers + n
       if (n==1){
           return 1;
       }
       else{
           return n+recursum(n-1);
       }
    }

    //method to print average of numbers passed through parameters
    static void average(int a[]){

        int sum=0;
        for (int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        float avr =(float)(sum / a.length);
        System.out.println("Average is "+avr);
    }

    //main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no whose table has to be printed");
        int n = sc.nextInt();
        table(n);
        System.out.println("Enter limit to print sum");
        int no = sc.nextInt();
        System.out.println("sum is "+recursum(no));
        System.out.println("Enter how many numbers to be entered");
        int size = sc.nextInt();
        int []arr = new int[size];
        System.out.println("Enter numbers whose average is to be found: ");
        for (int ele:arr) {
            arr[ele] = sc.nextInt();
        }
        average(arr);
    }

}
