package com.subArrays;
import java.util.Scanner;
// Print sum of all subArrays of a given Array.
public class SumOfAllSubArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int size1 = scan.nextInt();
        printSumOfSubArrays(ar, size1);
    }
    private static void printSumOfSubArrays(int[] ar, int size1) {

        for (int i = 0; i <= ar.length - size1; i++) {
           int sum=0;
            for (int j = i; j < i + size1; j++) {
                sum = sum + ar[j];
            }
            System.out.println(sum);
         }

        }
    }
