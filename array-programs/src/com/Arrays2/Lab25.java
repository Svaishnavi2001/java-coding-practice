package com.Arrays2;
import java.util.Scanner;
// i/p- 4 5 1 7 2  & k=6
// o/p- 4 2,5 1
// Print the pairs whose sum=k
public class Lab25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int k = scan.nextInt();
        printPairs(ar, k);
    }

    private static void printPairs(int[] ar, int k) {
        for (int i = 0; i < ar.length - 1; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] + ar[j] == k) {
                    System.out.println(ar[i] + " " + ar[j]);
                }
            }
        }
    }
}