package com.Arrays3;

public class CountOfDuplicateElements {
    public static void main(String[] args) {

        int []ar={2,2,2,3,4,4,4,23};

        countDuplicateEle(ar);

    }
    private static void countDuplicateEle(int[] ar) {
        int count = 1;
        int duplicateCount=0;

        for(int i=0;i<ar.length-1;i++){
            if(ar[i]==ar[i+1]){
                count++;
            }
            else{
                if(count > 1) {
                    duplicateCount++;
                }
                count=1;
            }
        }
        if(count>1) {
            duplicateCount++;
        }
        System.out.println(duplicateCount);
    }
}
