package com.programs;

class C1{
    public int x=5;
    protected int y=45;
    int z=6;
    private int a = 12;
    public void meth1(){
        System.out.println("This is meth1() from class c1 which has values of x,y,z,a defined int it and all are accessible.");
        System.out.println("\nx is public and its value is: "+x);
        System.out.println("y is protected and its value is: "+y);
        System.out.println("z is default and its value is: "+z);
        System.out.println("a is private and its value is: "+a);
    }
}
class C2{

}

public class P34_AccessModifiers {
    public static void main(String[] args) {
        System.out.println("Access modifiers determine whether other classes can use a particular field or invoke a particular method. Can be public, private, protected or default(no modifier)");
        System.out.println("This table shows which modifier can be used where:");
        System.out.println("Modifier\t\tClass\t\tPackage\t\tSubclass\t\tWorld");
        System.out.println("--------------------------------------------------------------");
        System.out.println("Public\t\t\tY\t\t\tY\t\t\tY\t\t\t\tY");
        System.out.println("Protected\t\tY\t\t\tY\t\t\tY\t\t\t\tN");
        System.out.println("Default\t\t\tY\t\t\tY\t\t\tN\t\t\t\tN");
        System.out.println("Private\t\t\tY\t\t\tN\t\t\tN\t\t\t\tN");
        C1 c1 = new C1();
        c1.meth1();
        System.out.println("showing public x =  "+c1.x+", protected y = "+c1.y+" and default z = "+c1.z+", but a is private hence not accessible inside a package");
    }
}
