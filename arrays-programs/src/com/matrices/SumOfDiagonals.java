package com.matrices;

public class SumOfDiagonals {
    public static void main(String[] args) {


        int ar[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum=0;
        for(int i=0;i<ar.length;i++){
           sum=sum+ar[i][i];
        }
        for(int i=0,j=ar.length-1;i<ar.length;i++,j--){
            if(i!=j){
                sum=sum+ar[i][j];
            }
        }
        System.out.println(sum);
    }
}
