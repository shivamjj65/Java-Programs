package com.programs;

public class P16_Array {
    public static void main(String[] args) {
        int marks[] = {98,44,55,67,88};
        System.out.println(marks[2]);
        System.out.println(marks.length);
        float score[]= {22.3f, 44.7f, 33.21f, 87.98f};
        for (float element: score){
            System.out.println(element);
        }
        System.out.println(score[3]);
        System.out.println("\n");
        String names[] = {"shiv","yukta","arjun","ram","laxman","sita","bhakt","shraddha","anjali"};
        System.out.println(names[1]);

        //Another way to display array
        System.out.println("\n");
        for (String element: names){
            System.out.println(element);
        }
        //PRINTING ARRAY IN REVERSE
        int []b={1,2,3,4,5,6,7,8,9};
        System.out.println("\n");
        for (int j=(b.length)-1;j>=0;j--){
            System.out.println(b[j]);
        }
    }
}
