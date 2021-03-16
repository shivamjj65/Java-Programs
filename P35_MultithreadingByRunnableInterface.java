package com.programs;

//Multithreading by implementing Runnable interface
class MyThread1 implements Runnable{
    public void run(){
        int i=0;
        while (i<300){
            System.out.println("I am a thread 1");
            i++;
        }
    }
}

class MyThread2 implements Runnable{
    public void run(){
        int j=0;
        while (j<400){
            System.out.println("I am a thread 2");
            j++;
        }
    }
}

public class P35_MultithreadingByRunnableInterface {
    public static void main(String[] args) {
        System.out.println("there are 2 ways to implement multithreading in java, \n1.BY EXTENDING THREAD CLASS\n2BY IMPLEMENTING RUNNABLE INTERFACE");
        MyThread1 ink1 = new MyThread1();       //object for class 1
        Thread pen1 = new Thread(ink1);         //Thread for class 1
        MyThread2 ink2 = new MyThread2();       //object for class 2
        Thread pen2 = new Thread(ink2);         //Thread for class 2
        pen1.start();
        pen2.start();
        //("To implement multithreading, lets consider example of a pen and ink, a pen only works if there is ink if only one of them is there then it cant work. So above I have created a object ink for class and that object is passed to a thread pen.");
        // Look in output that class 1 and 2 methods are run in random order as per as multithreading to improve performance
    }
}
