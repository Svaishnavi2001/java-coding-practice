package com.matrices;

public class ReversingRowsOfMatrix {
    public static void main(String[] args) {

        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};

        printingMatrix(ar);
        System.out.println();

        reverseOfRows(ar);
        printingMatrix(ar);
    }

    static void reverseOfRows(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            int start=0;
            int end=ar.length-1;

            while(start<end){
                int temp=ar[i][start];
                ar[i][start]=ar[i][end];
                ar[i][end]=temp;
                start++;
                end--;
            }
        }
    }

    static void printingMatrix(int[][] ar) {
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
