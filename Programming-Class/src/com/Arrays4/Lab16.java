package com.Arrays4;
import java.util.Scanner;
//  10
//  2 0 3 0 4 0 5 6 0 0
//  2 3 4 5 6 0 0 0 0 0
public class Lab16{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        moveAllZeros(ar);
    }
    private static void moveAllZeros(int[] ar) {
        int i=ar.length-1;
        int j=ar.length-1;
        while(i<ar.length){
            if(ar[i]==0){
                i++;
            }
            else{
                ar[j]=ar[i];
                j++;
                i++;
            }
        }
        while(j<ar.length){
            ar[j]=0;
            j++;
        }
        for(int k=0;k<ar.length;k++){
            System.out.print(ar[k]+" ");
        }
        System.out.println();
    }
}
