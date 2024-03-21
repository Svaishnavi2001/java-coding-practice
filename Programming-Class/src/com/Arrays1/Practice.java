package com.Arrays1;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int [] ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=sc.nextInt();
        }
        smallestEle(ar);
    }

    private static void smallestEle(int[] ar) {

        long min=Integer.MAX_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        System.out.println(min);

    }
//    private static void secLargeEle(int[] ar) {
//
//        long p=Integer.MIN_VALUE;
//        long vp=Integer.MAX_VALUE;
//
//        for(int i=0;i<ar.length;i++){
//            if(ar[i]>vp){
//                vp=p;
//                p=ar[i];
//            }
//            else if(ar[i]>vp && ar[i]!=p){
//                vp=ar[i];
//            }
//        }
//        System.out.println(vp);
//    }
    // private static void largeEle(int[] ar) {
//
//        int max=Integer.MIN_VALUE;
//
//        for(int i=0;i<ar.length;i++) {
//            if(ar[i]>max){
//                max=ar[i];
//            }
//
//        }
//        System.out.println(max);

    }

