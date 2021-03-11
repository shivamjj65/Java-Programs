package com.programs;

public class P19_MethodOverloading {
    static void printtext(){ //when we dont want to return anything we use void as return type
        System.out.println("\nModi hai toh mumkin hai !");
    }
    static int printext(int a){
        System.out.println("\nThe number is: "+a);
        return 0;
    }
    static void printext(String s){
        System.out.println("\n"+s);
    }
    public static void main(String[] args) {
        System.out.println("TWO OR MORE METHODS CAN HAVE SAME NAME BUT DIFFERENT PARAMETERS, THIS IS CALLED METHOD OVERLOADING");
        System.out.println("eg:\n\tvoid add(int x, int y)\n\tvoid add(int x, int y,int z)\n\tvoid add(int x, int y,int z,int m)");
        //example
        String name = new String("Shivam");
        printtext();
        printext(3);
        printext(name);
    }
}
