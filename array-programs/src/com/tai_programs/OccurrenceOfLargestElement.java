package com.tai_programs;

public class OccurrenceOfLargestElement {
    public static void main(String[] args) {
         int []ar={1,2,3,4,5,6,6};

       int largestElement=  findLargestEle(ar);
       int occurrence= countOccurrences(ar,largestElement);

        System.out.println(occurrence);

    }
    private static int findLargestEle(int[] ar) {
        int max=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
    private static int countOccurrences(int[] ar, int largestElement) {

        int count=0;
        for(int i=0;i<ar.length;i++){
            if(ar[i]==largestElement){
                count++;
            }
        }
        return count;
    }

}
