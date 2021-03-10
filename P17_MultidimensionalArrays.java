package com.programs;

public class P17_MultidimensionalArrays {
    public static void main(String[] args) {
        System.out.println("Multidimensional arrays are array in which their elements are too arrays");
        //Example:
        /*
            String names[] = {"Shivam","Parth","Vatsal"};
            Now here IF, Shivam, Parth, Vatsal too are arrays storing some other values, then its a 2d array,,and so on
            ex:
            String NamesAndAddress[3][1];
            Shivam --> Malad
            Parth --> Goregaon
            Vatsal --> Malad
         */
        int a[]; //!-D array
        int [][]flats; //2-D array
        flats = new int[2][3];    //NO OF ELEMENTS ARE: 2*3 = 6
        flats[0][0] = 101;  //1
        flats[0][1] = 102;  //2
        flats[0][2] = 103;  //3
        flats[1][0] = 104;  //4
        flats[1][1] = 105;  //5
        flats[1][2] = 106;  //6

        System.out.println("Printing a 2-D array");
        for (int i=0;i<flats.length;i++){
            for (int j=0;j<flats[i].length;j++){
                System.out.println(flats[i][j]);
            }
        }
    }
}
