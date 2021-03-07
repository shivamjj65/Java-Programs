package com.programs;

public class P07_ResultingDatatype {
    public static void main(String[] args) {
        System.out.println("Int + Int = int eg: 5+5=10");
        System.out.println("float + float = double / float eg: 10.5 + 10.4 = 20.9 ");
        //Increment and decrement operators
        int a=56;
        int b=a++; // means use b first and then operate on it
        int c= ++a; // means operate on a first then assign it
        System.out.println(b);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        System.out.println(a);

    }
}
