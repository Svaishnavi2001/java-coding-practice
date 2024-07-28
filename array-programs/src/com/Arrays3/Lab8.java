package com.Arrays3;
import java.util.Scanner;
// Given 2 Arrays print repeating element.
public class Lab8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size1 = scan.nextInt();
        int []ar1 = new int[size1];
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = scan.nextInt();
        }
        int size2 = scan.nextInt();
        int []ar2 = new int[size2];
        for (int j = 0; j < ar2.length; j++) {
            ar2[j] = scan.nextInt();
        }
        repeatingEle(ar1,ar2);
    }
    private static void repeatingEle(int[] ar1, int[] ar2) {
        int i=0,j=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]==ar2[j]){
                System.out.print(ar1[i]);
                j++;i++;
            }
            else if(ar1[i]>ar2[j]){
                j++;
            }
            else{
                i++;
            }
        }
    }
}
