package com.programs;
import java.util.Scanner;

public class CODE_IncomeTaxGenerator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("The income slab is");
        System.out.println("    2.5 L - 5.0 L        TAX 5%");
        System.out.println("    5.0 L - 10.0 L       TAX 20%");
        System.out.println("    10.0 L - 10.0 L +    TAX 30%");
        System.out.println("        NO TAX BELOW 2.5 L");
        System.out.println("\n Enter your income");
        double income = sc.nextDouble();
        if (income < 250000.0){
            System.out.println("No tax for you");
        }
        else if (income<500000 && income >250000.0){
            double tax = (income-250000)*0.05;
            System.out.println("Your tax is "+tax);
        }
        else if (income>500000 && income<1000000.0){
            double tax = (income-250000)*0.1;
            System.out.println("Your tax is "+tax);
        }
        else if (income >1000000.0){
            double tax = (income-250000)*0.2;
            System.out.println("Your tax is "+tax);
        }
    }
}
