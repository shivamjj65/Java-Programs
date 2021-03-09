package com.programs;

public class P12_DoWhile {
    public static void main(String[] args) {
        System.out.println("do\n{\n\t//code\n\n} while(condition);");
        System.out.println("Executes code and then check for condition");
        //Example
        int j=0;
        do{
            j++;
            System.out.println("Hello I am number five");
        }while(j<5);
    }
}
