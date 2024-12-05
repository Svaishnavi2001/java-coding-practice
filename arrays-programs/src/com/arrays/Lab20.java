package com.arrays;
import java.util.Scanner;
// Sum of (n-1) elements of an Array.(max sum and min sum)
public class Lab20 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        maxMinSum(ar);
    }
    static int maximumElement(int[] ar) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > max) {
                max = ar[i];
            }
        }
        return max;
    }
    static int minimumElement(int[] ar) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
    private static void maxMinSum(int[] ar) {
        int max= maximumElement(ar);
        int min=minimumElement(ar);
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        System.out.println(sum-min);
        System.out.println(sum-max);
    }
}