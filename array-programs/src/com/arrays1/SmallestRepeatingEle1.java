package com.arrays1;
//Print Smallest repeating element of an Array sorted in Ascending Order
public class SmallestRepeatingEle1 {
    public static void main(String[] args) {

        int []ar={1,2,2,3,4,5,6,};

        int res=smallestRepeatingEle(ar);
        System.out.println(res);
    }

    private static int smallestRepeatingEle(int[] ar) {

        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==ar[i+1]){
                return ar[i];
            }
        }
        return -1;
    }
}
