package com.subArrays;
import java.util.Scanner;
// Print all subArrays of given size,whose sum is equal to k
public class SubArrayOfSumEqualToK {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        int size1 = scan.nextInt();
        int k = scan.nextInt();
        sumOfSubArrays(ar, size1, k);
    }
    private static void sumOfSubArrays(int[] ar, int size1, int k) {

        for (int i = 0; i <= ar.length - size1; i++) {
            int sum = 0;
            for (int j = i; j < i + size1; j++) {
                sum=sum+ar[j];
            }
            if(sum == k) {
                for (int j = i; j < i + size1; j++){
                    System.out.print(ar[j]+" ");
                }
               System.out.println();
            }
        }
    }
}