package com.Arrays3;
import java.util.Scanner;
// Merging of 2 sorted Arrays.
public class MergeArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1=scan.nextInt();
        int[] ar1=new int[size1];
        for(int i=0;i<ar1.length;i++) {
            ar1[i] = scan.nextInt();
        }
        int size2=scan.nextInt();
        int []ar2=new int [size2];
        for(int j=0;j<ar2.length;j++){
            ar2[j]=scan.nextInt();
        }
        mergeArrays(ar1,ar2);
    }
    private static void mergeArrays(int[] ar1, int[] ar2) {
        int i=0,j=0,k=0;
        int []res=new int[ar1.length+ar2.length];

        while(i<ar1.length && j<ar2.length){
            if(ar1[i]>=ar2[j]){
                res[k]=ar2[j];
                j++;
                k++;
            }
            else{
                res[k]=ar1[i];
                i++;
                k++;
            }
        }
        while(i<ar1.length){
            res[k]=ar1[i];
            i++;
            k++;
        }
        while(j<ar2.length){
            res[k]=ar2[j];
            j++;
            k++;
        }
        for(int l=0;l<res.length;l++){
            System.out.print(res[l]+" ");
        }
    }
}
