package com.programs;
import java.util.Scanner;
public class P15_Arrays {
    public static void main(String[] args) {
        //Consider 5 children, To store their age we have 2 ways:
        // 1. CREATE 5 VARIABLES AND STORE
        // 2. CREATE AN ARRAY
        // EXAMPLE:
        Scanner sc=new Scanner(System.in);

        //DECLARING AND ALLOCATING MEMORY
        int age[] = new int[5];
        System.out.println("ENTER AGE");
        //ALLOCATION
        for (int i=0;i<5;i++){
            age[i]= sc.nextInt();
        }
        for (int i=0;i<5;i++){
            System.out.println(age[i]);
        }

        //DECLARING, ALLOCATING MEMORY AND INITIALIZATION TOGETHER
        int [] b = {1,2,3,4,5,6};
        System.out.println(b[3]);
    }
}
