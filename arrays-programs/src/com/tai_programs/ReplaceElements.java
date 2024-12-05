package com.tai_programs;

public class ReplaceElements {
    public static void main(String[] args) {

        int[] ar = {1,2,3,4,5,6,7,8};
        /*int k=6;

        int i=indexOfEle(ar,k);
        System.out.println(i);

    }
     private static int indexOfEle(int[] ar, int k) {

        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                return i;
            }
        }
        return -1;
    }*/
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] % 2 == 0) {
                ar[i] = 0;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}