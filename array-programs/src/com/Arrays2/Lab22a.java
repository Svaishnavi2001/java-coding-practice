package com.Arrays2;
import java.util.Scanner;
// Minimum sum of 2 elements of an Array.(Min Sum pair)
public class Lab22a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        minSum(ar);
    }
    static int firstMinimumEle(int []ar) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i]<min) {
                min = ar[i];
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
        private static void minSum(int[] ar) {
        int fmin=firstMinimumEle(ar);
        int smin=secMinimumEle(ar);
            System.out.println(fmin+smin);
    }
}
