package com.imp_programs;

public class InsertElement {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6};
        int n=7;
        int position=3;

        insertElement(ar,n,position);
    }

    private static void insertElement(int[] ar, int n, int position) {

        if(position<0 && position>ar.length){
            throw new IllegalArgumentException("Invalid position");
        }
        // Create a new array with a size greater than the original array by one
        int []newArray=new int[ar.length+1];

        // Copy elements up to the insertion position
        for(int i=0;i<position;i++){
            newArray[i]=ar[i];
        }
        // Insert the new element at the specified position
        newArray[position]=n;

        // Copy the remaining elements after the insertion position
        for(int i=position;i<ar.length;i++){
            newArray[i+1]=ar[i];
        }
        // modified array
        for(int i=0;i<newArray.length;i++) {
            System.out.print(newArray[i]+" ");
        }
    }
}
