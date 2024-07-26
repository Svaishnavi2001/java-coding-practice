package com.Arrays3;
import java.util.Scanner;
// Frequency of each element present in an Array.
public class FrequencyOfEachElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] ar = new int[size];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = scan.nextInt();
        }
        freqOfEachEle(ar);
    }
    private static void freqOfEachEle(int[] ar) {
        int count=1;

        for(int i=0;i<ar.length-1;i++){
          if( ar[i]==ar[i+1]){
              count++;
          }
          else{
              System.out.println(ar[i]+" _ "+count);
              count=1;
          }
        }
        System.out.println(ar[ar.length-1]+" _ "+count);
    }
}
