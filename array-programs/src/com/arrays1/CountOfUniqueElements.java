package com.arrays1;

// Print the count of unique elements of an Array.
public class CountOfUniqueElements {
    public static void main(String[] args) {

        int []ar={2,2,2,3,4,4,4,23};

        countUniqueEle(ar);
    }
    private static void countUniqueEle(int[] ar) {
        int count = 1;
        int uniqueCount=0;

        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==ar[i+1]){
                count++;
            }
            else{
                if(count == 1) {
                    uniqueCount++;
                }
                count=1;
            }
        }
        if(count==1) {
            uniqueCount++;
        }
        System.out.println(uniqueCount);
    }
}