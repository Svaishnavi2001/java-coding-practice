package com.number_and_loops;
import java.util.Scanner;
// Multiples of a given number.
public class Lab8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int x=scan.nextInt();
        multipleOfNum(n,x);
    }

    private static void multipleOfNum(int n,int x) {
        for(int i=1;i<x;i++){
            if(i%n==0){
                System.out.println(i);
            }

        }
    }
}
