package com.programs;

//Example of private:
class Employee{
    private int id;
    private String name;
    //id and name are private so they cant be accessed directly from main method using class object, instead a value is to be passed through an object and that value can be assigned to the attributes of the class
    public void setId(int no)
     {
        id = no;
     }
     public void setName(String s){
        name = s;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
}
public class P23_AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Access modifies are: \nPrivate\nPublic\nProtected\nDefault");
        System.out.println("-----------");

        Employee s = new Employee();

        s.setId(22);
        System.out.println(s.getId());
        s.setName("Tony");
        System.out.println(s.getName());

    }
}
