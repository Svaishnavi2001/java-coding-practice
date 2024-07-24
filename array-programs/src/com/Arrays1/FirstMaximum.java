package com.Arrays1;

// Largest element of an Array.
public class FirstMaximum {
    public static void main(String[] args) {

        int []ar={1,2,4,6,7,8};
        largestElement(ar);
    }
    private static void largestElement(int[] ar) {

        // for min value-Integer.MAX_VALUE
        long max=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        System.out.println(max);
    }
}