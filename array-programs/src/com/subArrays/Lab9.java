package com.subArrays;
import java.util.Scanner;
//Given an Array of size N,print all subArrays of an Array.
public class Lab9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int size1=scan.nextInt();
        printSubArrays(ar,size1);
    }
    private static void printSubArrays(int[] ar, int size1) {
        for(int i=0;i<=ar.length-size1;i++){
            for(int j=i;j<i+size1;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}
