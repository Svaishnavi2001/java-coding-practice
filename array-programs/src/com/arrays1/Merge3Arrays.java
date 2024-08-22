package com.arrays1;
import java.util.Scanner;
// Merging of 3 Arrays
public class Merge3Arrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int[] ar1 = new int[size1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scan.nextInt();
        }
        int size2 = scan.nextInt();
        int[] ar2 = new int[size2];
        for (int i = 0; i < ar2.length; i++) {
            ar2[i] = scan.nextInt();
        }
        int size3 = scan.nextInt();
        int[] ar3 = new int[size3];
        for (int i = 0; i < ar2.length; i++) {
            ar3[i] = scan.nextInt();
        }
        merge3Arrays(ar1,ar2,ar3);
    }
    private static void merge3Arrays(int[] ar1, int[] ar2, int[] ar3) {
        int i=0,k=0;
        int []res=new int[ar1.length+ar2.length+ar3.length];
        while(k<res.length){
            if(i<ar1.length){
                res[k]=ar1[i];
                k++;
            }
            if(i<ar2.length){
                res[k]=ar2[i];
                k++;
            }
            if(i<ar3.length){
                res[k]=ar3[i];
                k++;
            }
            i++;
        }
        for(int j=0;j<res.length;j++){
            System.out.print(res[j]+" ");
        }
    }
}