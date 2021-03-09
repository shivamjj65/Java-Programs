package com.programs;
import java.util.Scanner;
public class P13_ForLoop {
    public static void main(String[] args) {
        System.out.println("For Loop:");
        System.out.println("for(initialize ; check bool expression ; update)\n{\n\t//code\n}");
        //EXAMPLE
        int i;
        for (i=0;i<10;i++){
            System.out.println(i);
        }
        // Print odd numbers upto a given no.
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range");
        int n=sc.nextInt();
        for (i=0;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
