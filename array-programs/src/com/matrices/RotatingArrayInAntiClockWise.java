package com.matrices;
// Rotate an Array in Anti-clockwise by 90 degrees
public class RotatingArrayInAntiClockWise {
    public static void main(String[] args) {

        int ar[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        printingTheMatrix(ar);
        System.out.println();

        rotate90(ar);
        printingTheMatrix(ar);
        System.out.println();

        rotate90(ar);
        printingTheMatrix(ar);
        System.out.println();

        rotate90(ar);
        printingTheMatrix(ar);
        System.out.println();

        rotate90(ar);
        printingTheMatrix(ar);
        System.out.println();

        /*rotate180(ar);
        printingTheMatrix(ar);
        System.out.println();

        rotate360(ar);
        printingTheMatrix(ar);*/
    }

    static void transposeMatrix(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++){

                int temp=ar[i][j];
                ar[i][j]=ar[j][i];
                ar[j][i]=temp;
            }
        }
    }

    static void reverseColumns(int[][] ar) {

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

    static void rotate90(int[][] ar) {

        transposeMatrix(ar);
        reverseColumns(ar);
    }

    /*static void rotate180(int ar[][]){
        rotate90(ar);
    }

    static void rotate360(int ar[][]){
        rotate90(ar);
        rotate180(ar);
    }*/
    static void printingTheMatrix(int[][] ar) {

        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar[i].length;j++){
                System.out.print(ar[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
