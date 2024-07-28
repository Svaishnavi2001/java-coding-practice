package com.SubArrays;
import java.util.Scanner;
// Print sum of maximum sized subArray of a given Array.
public class Lab14 {
    public static void main(String[] args) {
       int []ar={1,2,3,4,5,6};
        printAllSubArrays(ar);
    }

    private static void printAllSubArrays(int[] ar) {
        int sum = 0;
        for (int size = ar.length; size >= 1; size--) {
            for(int i=0;i<=ar.length-size;i++){
                sum=0;
                for(int j=i;j<i+size;j++){
                    sum=sum+ar[j];
                }
            }
            break;
        }
        System.out.println(sum);
    }
}