package com.Arrays1;
import java.util.Scanner;
//  Maximum element of an array.
public class Lab18 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++) {
            ar[i]=scan.nextInt();
        }
        maxNumber(ar);
    }
    private static void maxNumber(int[] ar) {

        long max=Integer.MIN_VALUE;
        // for min value-Integer.MAX_VALUE
        for(int i=0;i<ar.length;i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}