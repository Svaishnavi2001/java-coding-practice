package com.arrays;
import java.util.Scanner;
// Highest element index of an Array.
public class Lab19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        maxNumIndex(ar);
    }
    private static void maxNumIndex(int[] ar) {
        int max=Integer.MIN_VALUE;
        int index=0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}