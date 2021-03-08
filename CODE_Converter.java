package com.programs;
import java.util.Scanner;

public class CODE_Converter {
    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        System.out.println("Choose your convertor");
        System.out.println("press \n1 FOR TEMPERATURE \n2 FOR DISTANCE \n3 FOR WEIGHT");
        int a= sc.nextInt();
        switch (a){
            case 1:
                System.out.println("You selected Temperature \n Press 1 For C To F \n Press 2 For F To C");
                int choice1= sc.nextInt();
                System.out.println("enter temp");
                float temp= sc.nextFloat();
                if (choice1==1){
                    float t1= ((temp*9)/5)+32;
                    System.out.println("temp from C to F is "+t1);
                }
                else if(choice1==2){
                    float t2= (temp-32)*5/9;
                    System.out.println("temp from F to C is "+t2);
                }
                break;
            case 2:
                System.out.println("You selected Distance \n Press 1 For KM To Miles \n Press 2 For KM To Metres");
                int choice2=sc.nextInt();
                System.out.println("enter dist");
                float dist= sc.nextFloat();
                if (choice2==1){
                    System.out.println("km to miles is "+(dist/1.609));
                }
                else if(choice2==2){
                    System.out.println("km to metres is "+dist*1000);
                }
                break;

        }
    }
}
