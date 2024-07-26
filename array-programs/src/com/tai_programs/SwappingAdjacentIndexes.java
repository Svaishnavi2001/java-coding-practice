package com.tai_programs;

public class SwappingAdjacentIndexes {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6};

        //before swapping the indexes
        printTheArray(ar);

        swapAdjIndexes(ar);

        // after swapping the indexes
        printTheArray(ar);
    }

    private static void printTheArray(int[] ar) {

        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
    }

    private static void swapAdjIndexes(int[] ar) {

        for(int i=0;i<ar.length-1;i=i+2){
            int temp=ar[i];
            ar[i]=ar[i+1];
            ar[i+1]=temp;
        }
    }
}
