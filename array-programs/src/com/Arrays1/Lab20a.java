package com.Arrays1;
import java.util.Scanner;
// Product of (n-1) elements of an Array.
// i/p- 3 5 2 1 4
// o/p- 40 24 60 120 30
public class Lab20a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        maxMinProduct(ar);
    }
    private static void maxMinProduct(int[] ar) {
       int pro=1;

       for(int i=0;i<ar.length;i++){
           pro=pro*ar[i];
       }
       int []res=new int[ar.length];
       for(int i=0;i<ar.length;i++){
           res[i]=pro/ar[i];
       }
       for(int i=0;i<ar.length;i++){
           System.out.print(res[i]+" ");
       }
    }
}
