package com.programs;

//custom class having name Name, attributes id and name, method printDetails()
class Name{
int id;
String name;
int age;
public void printDetails(){
    System.out.println("My name is "+name+", id is "+id+" and age is: "+age);
}
}

public class P22_OopsClasses {
    public static void main(String[] args) {
        System.out.println("One java file can have only one public class rest should be written directly as above.");
        System.out.println("This is inside class P22_OopsClasses");
        Name shivv = new Name();            //Creating object shivv for class Name
        shivv.id = 1;                       // Setting property
        shivv.name = "Shivam Patel";        // Setting property
        shivv.age = 20;                      //Setting property
        Name yukk = new Name();
        yukk.id = 2;
        yukk.name = "Yukta A";
        yukk.age = 20;
        //System.out.println(Shivv.id);     //Printing
        //System.out.println(Shivv.name);   //Printing
        System.out.println("\n");
        shivv.printDetails();
        yukk.printDetails();
    }
}
