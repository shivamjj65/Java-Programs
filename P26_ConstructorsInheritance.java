package com.programs;

//-------------------------------------- CLASS BISCUIT -----------------------------------------------------//
class Biscuit{
    String Brand;
    String name;
    //Constructor
    Biscuit(){
        System.out.println("I am a Biscuit Constructor !");
    }
    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
// -------------------------------------------DERIVED CLASS--------------------------------------------------//
class DerivedBiscuit extends Biscuit{
    int price;

    DerivedBiscuit(){
        System.out.println("I am derived biscuit !");
    }
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}


 // ------------------------------------------MAIN CLASS----------------------------------------------------- //

public class P26_ConstructorsInheritance {
    public static void main(String[] args) {
        System.out.println("\nFrom Base class");
        Biscuit parle = new Biscuit();
        System.out.println("\nFrom Derived class");
        DerivedBiscuit p = new DerivedBiscuit();
    }
}
