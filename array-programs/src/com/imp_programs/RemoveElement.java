package com.imp_programs;

public class RemoveElement {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5};
        int n=2;
        removeEle(ar,n);


    }

    private static void removeEle(int[] ar, int n) {

        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==n){
                count++;
            }
        }
        // Create a new array with a size less than the original array by the number of elements to remove
        int []newArray=new int[ar.length-count];
        int j=0;

        // Copy elements except the one to remove
        for(int i=0;i<ar.length;i++) {
            if (ar[i] != n) {
                newArray[j] = ar[i];
                j++;
            }

        }
        // original array
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        // new array
        for(int k=0;k<j;k++){
            System.out.print(newArray[k]+" ");
            }

        }

    }

