package com.matrices;

public class TransposeOfMatrix {
    public static void main(String[] args) {

        //int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printTheMatrix(ar);
        System.out.println();

        transposeOfMatrix(ar);
        printTheMatrix(ar);
    }

    static void printTheMatrix(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
    }

     static void transposeOfMatrix(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){

                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
    }
}
