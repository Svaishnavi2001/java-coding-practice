package com.Arrays;
import java.util.Scanner;
// Print sum of elements of an array.
public class Lab17 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int size= scan.nextInt();
        int []ar=new int[size];

        for(int i=0;i<ar.length;i++){
            ar[i]=scan.nextInt();
        }
        int sum=0;
        for(int i=0;i<ar.length;i++){
            sum=sum+ar[i];
        }
        System.out.println(sum);

    }
}
