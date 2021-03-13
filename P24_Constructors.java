package com.programs;

class Car{                          // class named car
    String name;                    //properties or attributes
    int model_year;
    String color;

    /* Constructor has same name as of class and no return type ; ie nothing just Car(parameters)*/
    Car(String name, int model_year, String color){
        this.name = name;
        this.model_year = model_year;
        this.color = color;
    }

    //method 1
    public String getName(){
        return name;
    }
    //method 2
    public int getModel_year(){
        return model_year;
    }
    //method 3
    public String getColor(){
        return color;
    }
}

public class P24_Constructors {
    public static void main(String[] args) {
        //object created for class car and values are set
        Car M = new Car("Swift", 2018, "White");
        System.out.println(M.getName());
        System.out.println(M.getModel_year());
        System.out.println(M.getColor());
    }
}
