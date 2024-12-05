package com.arrays1;
//Print Smallest repeating element of an Array sorted in Descending Order

public class SmallestRepeatingEle2 {
    public static void main(String[] args) {
        int []ar={6,5,4,3,2,2,1};

        int res=smallestRepeatingEle(ar);
        System.out.println(res);
    }

    private static int smallestRepeatingEle(int[] ar) {

        for(int i=ar.length-1;i>0;i--){
            if(ar[i]==ar[i-1]){
                return ar[i];
            }
        }
        return -1;
    }
}

