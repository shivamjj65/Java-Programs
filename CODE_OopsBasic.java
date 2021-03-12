package com.programs;
import java.util.Scanner;


//---- CLASS STUDENT HAVING ATTRIBUTES ROLL_NO AND NAME, ALSO METHODS Set ROLL, CHANGE ROLL ARE INCLUDED ----//
class Students{
    Scanner sc = new Scanner(System.in);

    int rollno;
    String name;

    public void setRoll(int roll){
        rollno = roll;
        System.out.println(rollno);
    }

    public void changeRoll(){
        System.out.println("Enter a new roll:");
        int rollno = sc.nextInt();
        System.out.println("New roll is of "+name+" is "+rollno);
    }
}
// ----------------------------------------------------------------------------------------- //


//---- CLASS SquareAndRectangle for calculating area, perimeter,etc ----//
class SquareAndRectangle{
    Scanner sc = new Scanner(System.in);

    float length,breadth,side;

    public void Square(){
        System.out.println("Enter side of square");
        side= sc.nextFloat();
        float area = side*side;
        System.out.println("Area of square is: "+area);
        float perimeter = side*4;
        System.out.println("Perimeter of square is: "+perimeter);
    }
    public void Rectangle(){
        System.out.println("Enter length and breadth");
        length= sc.nextFloat();
        breadth = sc.nextFloat();
        float area = length*breadth;
        System.out.println("Area of rectangle is: "+area);
        float perimeter = (length*2)+(breadth*2);
        System.out.println("Perimeter of rectangle is: "+perimeter);
    }

}
// ------------------------------------------------------------------------------------------//


public class CODE_OopsBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter choice: \n1.FOR STUDENT ROLL CHANGE \n2. FOR SQUARE AREA AND PERIMETER \n3. FOR RECTANGLE AREA AND PERIMETER");
        int c=sc.nextInt();


        switch (c) {
            case 1 -> {
                //-- FOR CLASS STUDENTS --//
                Students tony = new Students();
                System.out.println("Roll no of tony is: ");
                tony.setRoll(1);
                tony.changeRoll();
                // ----------------------------------------------------------------------------- //
            }
            case 2 -> {
                //-- FOR CLASS SquareAndRectangle --//
                //FOR Square
                SquareAndRectangle a = new SquareAndRectangle();
                a.Square();
                // ----------------------------------------------------------------------------- //
            }
            case 3 -> {
                //-- FOR CLASS SquareAndRectangle --//
                //FOR Rectangle
                SquareAndRectangle b = new SquareAndRectangle();
                b.Rectangle();
                // ----------------------------------------------------------------------------- //
            }
        }

    }
}
