package com.programs;

class Base{
    // Base class
    int x;

    Base(){
        //Constructor
        System.out.println("Hello this is inside a constructor");
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in base and Setting value for x");
        this.x = x;
    }
    public void printMe(){
        System.out.println("This is inside a method");
    }
}

class Derived extends Base{
    // Derived will now access and inherited everything from class Base
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class P25_Inheritance {
    public static void main(String[] args) {
        System.out.println("Inheritance is used to borrow properties and methods from an existing class.\n eg:\t Phone --> Smartphone \n\t\t Superclass --> Subclass");
        System.out.println("Inheritance is declared in java by using keyword 'extends'");
        Base b = new Base();
        b.setX(4);
        System.out.println("value of x is: ");
        System.out.println(b.getX());
        Derived d = new Derived();
        d.setX(23);
        d.setY(2);
        System.out.println("This is from Derived class");
        System.out.println("x derived from base "+d.getX());
        System.out.println("y is from derived class "+d.getY());
    }
}

