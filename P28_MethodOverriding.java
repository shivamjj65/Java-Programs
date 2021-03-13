package com.programs;

class A{
    int x;
    public void meth1(){
        System.out.println("Method 1 from class A");
    }
    public void meth2(){
        System.out.println("Method 2 from class A");
    }
}

class B extends A{
    public void meth2(){
        System.out.println("Method 2 from class B");
    }
    public void meth3(){
        System.out.println("Method 3 from class B");
    }
}

public class P28_MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(); // B inherits all methods from class A
        a.meth2();  // will run meth2() from A
        b.meth2();  // this will to run meth2() from A since B inherits class A, but Class B has its own meth2(), so by method overriding, meth2() would be run from class B.
    }
}
