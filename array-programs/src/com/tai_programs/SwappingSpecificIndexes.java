package com.tai_programs;

public class SwappingSpecificIndexes {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6};
        int index1=1;
        int index2=2;

        // before swapping
        printArray(ar);

        swapIndexes(ar,index1,index2);

        // after swapping
        printArray(ar);
    }
    private static void printArray(int[] ar) {

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }
    private static void swapIndexes(int[] ar, int index1, int index2) {

       int temp=ar[index1];
       ar[index1]=ar[index2];
       ar[index2]=temp;
    }
}
