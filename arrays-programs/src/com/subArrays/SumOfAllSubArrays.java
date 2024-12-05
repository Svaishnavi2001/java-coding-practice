package com.subArrays;
import java.util.Scanner;
// Print sum of all subArrays of a given Array.
public class SumOfAllSubArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int s1 = scan.nextInt();
        printSumOfSubArrays(ar, s1);
    }
    private static void printSumOfSubArrays(int[] ar, int s1) {


        for (int i = 0; i <= ar.length - s1; i++) {
           int sum=0;
            for (int j = i; j < i + s1; j++) {
                sum = sum + ar[j];
            }
            System.out.println(sum);
         }

        }
    }
