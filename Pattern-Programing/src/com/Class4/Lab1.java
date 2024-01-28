package com.Class4;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int arr1[] = {1,2};
        int arr2[] = {6,9};
        mergeArrays(arr1,arr2);
    }

    private static void mergeArrays(int[] ar1, int[] ar2) {
        int k=0;
        int res[]=new int [ar1.length + ar2.length];

        for(int i=0;i<ar1.length;i++){
            res[k] = ar1[i];
            k++;
        }
        for(int i=0;i<ar2.length;i++){
            res[k] = ar2[i];
            k++;
        }
        for(int i =0;i<res.length;i++){
            System.out.println(res[i] + " ");
        }
    }

}
