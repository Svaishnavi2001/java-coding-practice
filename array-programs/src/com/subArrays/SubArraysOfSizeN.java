package com.subArrays;
import java.util.Scanner;
//Given an Array of size N,print all subArrays of an Array.
public class SubArraysOfSizeN {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int []ar=new int[s];
        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int s1=scan.nextInt();
        printSubArrays(ar,s1);
    }
    private static void printSubArrays(int[] ar, int s1) {

        for(int i=0;i<=ar.length-s1;i++){
            for(int j=i;j<i+s1;j++){
                System.out.print(ar[j]+" ");
            }
            System.out.println();
        }
    }
}
