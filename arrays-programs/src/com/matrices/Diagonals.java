package com.matrices;
// Diagonals of n*n matrix
public class Diagonals {
    public static void main(String[] args) {

        // Main Diagonals
        System.out.println("Main diagonals:");
        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};

        System.out.println();
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i][i]+" ");
        }
        System.out.println();

        System.out.println("Secondary diagonals:");
        // Secondary Diagonals
        for(int i=0,j=ar.length-1;i<ar.length;i++,j--){
            System.out.print(ar[i][j]+" ");
        }
    }
}
