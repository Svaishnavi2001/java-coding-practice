package com.Arrays2;
import java.util.Scanner;
// Minimum product pair of an Array.

public class Lab23 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
          minProduct(ar);
    }
     static int firstMaximumEle(int []ar){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
     }
     static int secMaximumEle(int []ar){
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
         return vp;
     }
     static int firstMinimumEle(int []ar){
        int min=Integer.MAX_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]<min){
                min=ar[i];
            }
        }
        return min;
    }
    static int secMinimumEle(int []ar){
        int p=Integer.MAX_VALUE;
        int vp=Integer.MAX_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]<p){
                vp=p;
                p=ar[i];
            }
            else if(ar[i]<vp && ar[i]!=p){
                vp=ar[i];
            }
        }
        return vp;
    }
    private static void minProduct(int[] ar) {
        int fmax=firstMaximumEle(ar);
        int fmin=firstMinimumEle(ar);
        int smax=secMaximumEle(ar);
        int smin=secMinimumEle(ar);

        int p1=fmin*smin;
        int p2=fmax*smax;
        int p3=fmin*fmax;

        int min=0;
        if(p1<p2){
            min=p1;
        }
        else {
            min=p2;
        }
        if(min<p3){
            System.out.println(min);
        }
        else{
            System.out.println(p3);
        }
    }
}
