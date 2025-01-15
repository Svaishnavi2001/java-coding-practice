package com.arrays;
import java.util.Scanner;
// Product of elements of an Array
public class Lab17a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int product=1;
        for(int i=0;i<ar.length;i++){
            product=product*ar[i];
        }
        System.out.println(product);
    }

}