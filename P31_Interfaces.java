package com.programs;

//--------------THIS IS INTERFACE WHICH DEFINE ABOUT A BIKE, AND WILL WORK ON 2 FUNCTIONS ie; Accelarate bike and Apply brake to Bike
interface Bike{
    void accelarate(int i);
    void brake(int i,int d);
}

//-----------------THIS IS CLASS SPLENDOR WHICH WILL IMPLEMENT BIKE WHICH CAN ACCELARATE AND APPLY BRAKE

class Splendor implements Bike{
    @Override
    public void accelarate(int i) {
        boolean movement = false;
        int speed = 0;
        if(speed==0){
            movement = true;
            speed = i;
        }
        System.out.println("Hurray...Starting bike and Your splendor will now move at speed of "+speed+" Km/hr");
    }

    @Override
    public void brake(int i,int d) {
        boolean movement = true;
        int speed = i;
        if (movement&&speed>0){
            movement = false;
            speed = speed - d;
        }
        System.out.println("\nOkay applying brakes and decreasing the speed by "+d+" Km/hr The speed decreased to "+speed+" Km/hr");
    }
}

public class P31_Interfaces {
    public static void main(String[] args) {
        System.out.println("In english interface means where 2 systems meet eg: mouse with pc, tv with remote, \nIn java interface is group of related methods with empty bodies\n\n");
        Splendor s = new Splendor();
        s.accelarate(30);
        s.brake(30,10);
    }
}
