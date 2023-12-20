package com.Arrays3;
import java.util.Scanner;
// Print the count if unique elements of an Array.
public class Lab3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
              ar[i]=scan.nextInt();
          }
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