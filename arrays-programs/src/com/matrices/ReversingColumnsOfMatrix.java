package com.matrices;

public class ReversingColumnsOfMatrix {
    public static void main(String[] args) {

        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};

        printMatrix(ar);

        System.out.println();
        reverseOfColumns(ar);

        printMatrix(ar);
    }

     static void reverseOfColumns(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            int start=0;
            int end=ar.length-1;

            while(start<end){
                int temp=ar[start][i];
                ar[start][i]=ar[end][i];
                ar[end][i]=temp;
                start++;
                end--;
            }
        }
    }

     static void printMatrix(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
