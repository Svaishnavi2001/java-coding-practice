package com.subArrays;
import java.util.Scanner;
// Print sum of all subArrays of a given Array.
public class SumOfAllSubArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int s = scan.nextInt();
        printSumOfSubArrays(ar, s);
    }
    private static void printSumOfSubArrays(int[] ar, int s) {


        for (int i = 0; i <= ar.length - s; i++) {
           int sum=0;
            for (int j = i; j < i + s; j++) {
                sum = sum + ar[j];
            }
            System.out.println(sum);
         }

        }
    }
