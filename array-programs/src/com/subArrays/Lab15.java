package com.subArrays;
import java.util.Scanner;
//  7
//  2 -1 4 -1 3 6 -1
// -1 -1 -1 -1 2 4 3
// Pull all the -1 to the starting of an Array.
public class Lab15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        moveAllNegNum(ar);
    }
    private static void moveAllNegNum(int[] ar) {
        int i = ar.length - 1;
        int j = ar.length - 1;
        while (i >= 0) {
            if (ar[i] == -1) {
                i--;
            }
            else {
                ar[j] = ar[i];
                j--;
                i--;
            }
        }
            while (j >= 0) {
                ar[j] = -1;
                j--;
            }
            for (int k = 0; k < ar.length; k++) {
                System.out.print(ar[k] + " ");
            }
        System.out.println();
        }
    }


