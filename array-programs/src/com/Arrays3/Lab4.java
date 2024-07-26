package com.Arrays3;
import java.util.Scanner;
//Print largest repeating element of an Array.
public class Lab4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int []ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
       int res= largestRepeatingEle(ar);
        System.out.println(res);
    }
    private static int largestRepeatingEle(int[] ar) {
        for (int i=ar.length-1;i>=0;i--) {
            if (ar[i]==ar[i-1]) {
                return ar[i];
            }
        }
            return -1;
    }
}
