package com.programs;

public class P20_VariableArguements {
    /*static int sum(int a, int b){
        return a+b;
    }
    static int sum(int a, int b,int c){
        return a+b+c;
    }
    static int sum(int a, int b,int c,int d){
        return a+b+c+d;
    }
    */

    static int sum(int ...arr){
        int sum=0;
        for (int a:arr) {
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String[] args) {

        //WE CREATED A NEW METHOD FOR EACH NUMBER OF PARAMETERS, IF WE PASS MULTIPLE PARAMETERS THROUGH A SINGLE METHOD IT WILL THROW A ERROR
        //HENCE VARIABLE ARGUEMENTS IS USED
        /*static int sum(int ...arr)        //all parameters which are passed here woulde be stored in a array
        {
            //this method can take n number of parameters
        }
        */
        System.out.println("Sum of 4 and 5 is: "+(sum(4,5)));
        System.out.println("Sum of 4 and 5 and 6 is: "+(sum(4,5,6)));
        System.out.println("Sum of 4 and 5 and 6 and 7 is: "+(sum(4,5,6,7)));
    }
}
