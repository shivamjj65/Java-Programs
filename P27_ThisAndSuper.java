package com.programs;

//Super is used during constructor overloading
class ConstrOverload{
    int x;
    ConstrOverload(){
        System.out.println("hello this is constructor without parameters");

    }
    ConstrOverload(int y){
        this.x = y;
        System.out.println("Value of x is: "+x);
    }
    ConstrOverload(int a,int b,int c){
        this.x = a+b+c;
        System.out.println("Addition of a,b,c through a constructor is: "+x);
    }
}
class abc extends ConstrOverload{
    // since abc extends ConstrOverload
    // this will run the all constructors from base class and its constructors by default
    abc(){
        super(1,2,3);
        //but super will only let run the constructor with parameters as the number of parameters given through it
    }
}
public class P27_ThisAndSuper {
    public static void main(String[] args) {
        abc x = new abc(); // object for derived class from base
        System.out.println("By default Constructor without any parameters is being called and executed");
        System.out.println("If we want to run Constructor with a parameter 'super' keyword is used");
    }
}
