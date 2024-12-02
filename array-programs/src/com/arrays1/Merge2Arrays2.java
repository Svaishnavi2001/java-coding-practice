package com.arrays1;

public class Merge2Arrays2 {

    public static void main(String[] args) {

        int ar1[]={1,2,3,4,5};
        int ar2[]={3,4,5,6,7,8,9};
        //res[k]={1,2,3,4,5,3,4,5,6,7,8,9};

        merge2Arrays(ar1,ar2);
    }
    private static void merge2Arrays(int ar1[],int ar2[]){
        int k=0;
        int res[]=new int[ar1.length+ar2.length];

        for (int i=0;i<ar1.length;i++){
            res[k]=ar1[i];
            k++;
        }
        for(int j=0;j<ar2.length;j++){
            res[k]=ar2[j];
            k++;
        }

        for(int l=0;l<res.length;l++){
            System.out.print(res[l]+" ");
        }
    }
}
