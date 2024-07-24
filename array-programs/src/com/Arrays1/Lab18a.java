package com.Arrays1;
import java.util.Scanner;
// 2nd largest element of an Array.

public class Lab18a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        secLargestEle(ar);
    }
    private static void secLargestEle(int[] ar) {
        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>p){
                vp=p;
                p=ar[i];
            }
            else if(ar[i]>vp && ar[i]!=p){
                vp=ar[i];
            }
        }
        System.out.println( vp);
    }
}
