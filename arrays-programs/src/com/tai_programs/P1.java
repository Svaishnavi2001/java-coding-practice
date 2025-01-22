package com.tai_programs;

public class P1 {
    public static void main(String[] args) {

        int ar[][] = {{1,5,4}, {2,3,1}, {6,7,5}};
        printMatrix(ar);
    }
    private static void printMatrix(int ar[][]){
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
    }
}
