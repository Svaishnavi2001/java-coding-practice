package com.arrays;
import java.util.Scanner;
// Print possible pairs of an Array

public class Lab24 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        possiblePairs(ar);
    }
    private static void possiblePairs(int[] ar) {
        for(int i=0;i<ar.length-1;i++){
            for(int j=i+1;j<ar.length;j++){
                System.out.println(ar[i]+" "+ar[j]);
            }
        }
    }
}
