package com.imp_programs;
import java.util.Scanner;
// Minimum product pair of an Array.

public class MinimumProductPair {
    public static void main(String[] args) {

        int []ar={3,5,2,4,7};
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
        
        // for maximum elements product
        int p1=fmax*smax;
        int p2=fmin*smin;
        int p3=fmax*smax;

        /* for minimum elements product
        int p1=fmin*smin;
        int p2=fmax*smax;
        int p3=fmin*fmax; */

        int max=0;
        if(p1>p2){
            max=p1;
        }
        else {
            max=p2;
        }
        if(max>p3){
            System.out.println(max);
        }
        else{
            System.out.println(p3);
        }
    }
}
