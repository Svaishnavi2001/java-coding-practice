package com.tai_programs;

public class PrintElements {
    public static void main(String[] args) {

        int []ar={1,2,3,4,5,6,7};
        for(int i=0;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();

        int middleIndex=ar.length/2;

        for(int i=0;i<middleIndex;i++){
            System.out.print(ar[i]+" ");
        }
        System.out.println();
        for(int i=middleIndex;i<ar.length;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
