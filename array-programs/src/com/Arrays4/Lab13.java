package com.Arrays4;
import java.util.Scanner;
// Print all subArrays of a given Array.
public class Lab13 {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6};
        printAllSubArrays(ar);
    }

    private static void printAllSubArrays(int[] ar) {
        for (int size = ar.length; size >=1; size--) {
            for (int i = 0; i <= ar.length-size; i++) {
                for (int j = i; j < i + size; j++) {
                    System.out.print(ar[j]+" ");
                }
                System.out.println();

            }
            return;
        }
    }
}


