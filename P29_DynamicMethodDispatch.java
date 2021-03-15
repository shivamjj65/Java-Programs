package com.programs;

class Phone{
    public void name(){
        System.out.println("I am a simple phone");
    }
    public void greet(){
        System.out.println("Good morning");
    }
}

class Smartphone extends Phone{
    public void wish(){
        System.out.println("Hello");
    }
    public void name()
    {
        System.out.println("I am a smartphone");
    }
}


public class P29_DynamicMethodDispatch {
    public static void main(String[] args) {
        //object for class phone
        Phone obj1 = new Phone();
        System.out.println("Calling Phone name Method using reference of Phone and object created for Phone");
        obj1.name();                     // will run name method for class phone ie; ex: there is class Phone having Nokia 3310 as Phone in it
        //BUT
        Phone obj2 = new Smartphone();  // obj2 is from class Phone but for Smartphone type ie; Samsung s21 is a Phone but it can be said as a smartphone
        System.out.println("Calling Phone name method using reference of Phone and object created for Smartphone");
        obj2.name();

        obj2.greet();
    }
}
