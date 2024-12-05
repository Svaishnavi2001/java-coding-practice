package com.arrays1;
//Print largest repeating element of an Array sorted in Descending Order
public class LargestRepeatingEle2 {

        public static void main(String[] args) {
            int []ar={8,8,6,6,5,4,3,2,1};
            int res= largestRepeatingEle(ar);
            System.out.println(res);
        }
        private static int largestRepeatingEle(int[] ar) {
            for (int i=0;i<ar.length-1;i++) {
                if (ar[i]==ar[i+1]) {
                    return ar[i];
                }
            }
            return -1;
        }
    }


