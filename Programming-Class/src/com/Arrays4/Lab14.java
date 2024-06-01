package com.Arrays4;
import java.util.Scanner;
// Print sum of maximum sized subArray of a given Array.
public class Lab14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        printAllSubArrays(ar);
    }

    private static void printAllSubArrays(int[] ar) {
        int sum = 0;
        for (int s = ar.length; s >= 1; s--) {
            for(int i=0;i<=ar.length-s;i++){
                sum=0;
                for(int j=i;j<i+s;j++){
                    sum=sum+ar[j];
                }
            }
            break;
        }
        System.out.println(sum);
    }
}