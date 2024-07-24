package com.Arrays2;

public class SumOfThreeMaximums {
    public static void main(String[] args) {

        int []ar={1,2,3,6,8,6,7};
        sumOfThreeMaxEle(ar);
    }
    static int firstMax(int[] ar){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }
    static int secondMax (int []ar){
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
    static int thirdMax(int []ar){
       int p=Integer.MIN_VALUE;
       int vp=Integer.MIN_VALUE;
       int m=Integer.MIN_VALUE;

       for(int i=0;i<ar.length;i++){
           if(ar[i]>p){
               m=vp;
               vp=p;
               p=ar[i];
           }
           else if(ar[i]>vp){
               m=vp;
               vp=ar[i];
           }
           else if(ar[i]>m ){
               m=ar[i];
           }
       }
       return m;
    }

    private static void sumOfThreeMaxEle(int[] ar) {
        int fmax=firstMax(ar);
        int smax=secondMax(ar);
        int tmax=thirdMax(ar);

        System.out.println(fmax+smax+tmax);
    }
}
