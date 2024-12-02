package com.arrays1;

// Merging of 2 sorted Arrays.

public class Merge2Arrays1 {
    public static void main(String[] args) {

        int ar1[]={3,5,7,9,13};
        int ar2[]={1,2,3,4,9,15,17,19};
        //res[k]={1,2,3,3,4,5,7,9,9,13,15,17,19};

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
