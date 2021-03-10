package com.programs;
import java.util.Scanner;

public class CODE_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  CREATE ARRAY AND CALCULATE ITS SUM //
        System.out.println("CREATE ARRAY AND CALCULATE ITS SUM");
        System.out.println("Enter size of array");
        int n = sc.nextInt();
        int a[] = new int[n] ;
        int sum=0;
        System.out.println("Enter numbers");
        for (int i=0; i<a.length;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("The sum of array is: ");
        for (int i=0; i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println(sum);


        // Finding number in array //
        System.out.println("\n\nFinding number in array");
        System.out.println("Enter size of array");
        int no = sc.nextInt();
        int b[] = new int[no] ;
        System.out.println("Enter numbers");
        for (int i=0; i<b.length;i++){
            b[i]=sc.nextInt();
        }
        System.out.println("Enter no to be searched");
        int x= sc.nextInt();
        for (int i=0; i<b.length;i++){
            if (b[i]==x) {
                System.out.println("the number is found at " + (i+1) + " positon in array");
            }
        }
    }
}
