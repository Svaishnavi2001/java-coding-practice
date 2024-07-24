package com.Arrays1;

public class ThirdMaximum {
    public static void main(String[] args) {

        int []ar={1,2,3,3,4,4,5,5,6};

        thirdMaximum(ar);
    }

    private static void thirdMaximum(int[] ar) {

        if(ar.length<3){
            throw new IllegalArgumentException("Array must contain at least three distinct elements");
        }

        int p=Integer.MIN_VALUE;
        int vp=Integer.MIN_VALUE;
        int m=Integer.MIN_VALUE;

        for(int i=0;i<ar.length;i++){
            if(ar[i]>p) {
                m = vp;
                vp = p;
                p = ar[i];
            }
                else if( ar[i]>vp && ar[i]!=p){
                    m=vp;
                    vp=ar[i];
            }
                else if(ar[i]>m && ar[i]!=vp && ar[i]!=p){
                    m=ar[i];
            }
          }
        System.out.println(m);
        }

    }

