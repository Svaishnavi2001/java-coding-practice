package com.Arrays1;
import java.util.Scanner;
// Product of elements of an array
public class Lab17a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size=scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int sum=1;
        for(int i=0;i<ar.length;i++){
            sum=sum*ar[i];
        }
        System.out.println(sum);
    }

}