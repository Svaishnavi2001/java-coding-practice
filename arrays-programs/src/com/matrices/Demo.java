package com.matrices;

public class Demo {
    public static void main(String[] args) {

        System.out.println("1D Array");

        int ar[]={1,2,3,4,5};
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        System.out.println("\n2D Array");

        int ar1[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i< ar1.length;i++){
            for(int j=0;j<ar1[i].length;j++){
                System.out.print(ar1[i][j]+" ");
            }
            System.out.println();
        }
    }
}
