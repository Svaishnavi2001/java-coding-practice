package com.arrays1;
import java.util.Scanner;
// Merging of 3 Arrays
public class Merge3Arrays {
    public static void main(String[] args) {

        int ar1[]={2,3,4};
        int ar2[]={5,6,7,8};
        int ar3[]={9,10,11,12,13};
        //res[k]={2,5,9,3,6,10,4,7,11,8,12,13};

        merge3Arrays(ar1,ar2,ar3);
    }
    private static void merge3Arrays(int[] ar1, int[] ar2, int[] ar3) {
        int i=0,k=0;
        int res[]=new int[ar1.length+ar2.length+ar3.length];
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