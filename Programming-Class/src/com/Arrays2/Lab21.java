package com.Arrays2;
import java.util.Scanner;
// i/p- 3 7 2 7 1
// k=7
// o/p- 2
// Searching specific element in an Array.
public class Lab21 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int k=scan.nextInt();

       searchSpecElement(ar,k);
    }
    private static void searchSpecElement(int []ar, int k) {
        int count=0;

        for(int i=0;i<ar.length;i++){
            if(ar[i]==k){
                count++;
            }
        }
        System.out.println(count);
    }
}
