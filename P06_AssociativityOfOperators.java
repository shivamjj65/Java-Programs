package com.programs;

public class P06_AssociativityOfOperators {
    public static void main(String[] args) {
        int a = 6*5-34/2;
        System.out.println(a);
        int b = 6/5-34*2;
        System.out.println(b);
        System.out.println("Precedence : {} / *  % - +");
        System.out.println("Associavity for / and * is left to right, refer manual for more");
    }
}
