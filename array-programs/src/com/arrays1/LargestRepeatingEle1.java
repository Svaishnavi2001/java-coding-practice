package com.arrays1;

//Print largest repeating element of an Array sorted in Ascending Order

public class LargestRepeatingEle1 {
    public static void main(String[] args) {
       int []ar={1,2,3,4,5,6,6,8,8};
       int res= largestRepeatingEle(ar);
        System.out.println(res);
    }
    private static int largestRepeatingEle(int[] ar) {
        for (int i=ar.length-1;i>0;i--) {
            if (ar[i]==ar[i-1]) {
                return ar[i];
            }
        }
            return -1;
    }
}
