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
        int k = scan.nextInt();

        printAllSubArrays(ar, k);
    }

    private static void printAllSubArrays (int[] ar, int k) {
        int sum=0;
       for(int size=ar.length;size>=1;size--){
           for(int i=0;i<=ar.length-size;i++){
               sum=0;
               for(int j=i;j<i+size;j++){
                   sum=sum+ar[j];
               }
               if(sum==k){
                   for(int j=i;j<i+size;j++){
                       System.out.print(ar[j]+" ");
                   }
                   System.out.println();
                   break;
               }
           }
        }
    }
}