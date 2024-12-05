package com.arrays;
import java.util.Scanner;

public class Lab15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int [size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        for(int i=ar.length-1;i>=0;i--){
            System.out.print(ar[i]+" ");
        }
    }
}