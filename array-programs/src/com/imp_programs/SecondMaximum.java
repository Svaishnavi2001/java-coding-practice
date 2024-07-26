package com.imp_programs;

// 2nd largest element of an Array.

public class SecondMaximum {
    public static void main(String[] args) {

        int []ar={1,2,5,7,8,9};
        secLargestEle(ar);
    }
    private static void secLargestEle(int[] ar) {
        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>p){
                vp=p;
                p=ar[i];
            }
            else if(ar[i]>vp && ar[i]!=p){
                vp=ar[i];
            }
        }
        System.out.println( vp);
    }
}
