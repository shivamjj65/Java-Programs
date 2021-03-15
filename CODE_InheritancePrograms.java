package com.programs;

import java.util.Scanner;

class Circle{
    public float radius;

    public double area(int r){
        this.radius = r;
        System.out.println("Area of circle is: ");
        return (double) (Math.PI * this.radius * this.radius);
    }
}
class Cylinder extends Circle{
    public int h;

    public double volume(int r, int he){
        this.radius = r;
        this.h = he;
        return (double) (Math.PI * this.radius *this.radius * this.h);
    }
}
public class CODE_InheritancePrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.println("Enter radius for circle: ");
        int r = sc.nextInt();
        System.out.println(c.area(r));
        Cylinder cy = new Cylinder();
        System.out.println("Enter height for circle: ");
        int he = sc.nextInt();
        System.out.println(cy.volume(r,he));
    }
}
