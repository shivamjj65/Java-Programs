package com.programs;

abstract class Shape{
    abstract public void area();
}
class Circle1 extends Shape{
    public void area(){
        System.out.println("Area of circle is 3.14 * radius * radius");
    }
}
class Rectangle1 extends Shape{
    public void area(){
        System.out.println("Area of rectangle is length * breadth");
    }
}

public class P30_AbstractClassAndMethods {
    public static void main(String[] args) {
    Circle1 c = new Circle1();
    c.area();
    Rectangle1 r = new Rectangle1();
    r.area();
    }
}
