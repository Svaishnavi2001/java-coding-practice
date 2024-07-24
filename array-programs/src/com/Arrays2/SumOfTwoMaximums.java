package com.Arrays2;
import java.util.Scanner;
// Maximum sum of 2 elements of an Array. (Max Sum pair)
public class SumOfTwoMaximums {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        maxSum(ar);
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
    private static void maxSum(int[] ar) {
      int fmax=firstMaximumEle(ar);
      int smax=secMaximumEle(ar);
        System.out.println(fmax+smax);

    }
}
