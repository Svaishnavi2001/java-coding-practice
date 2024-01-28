package com.ExceptionHandling;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        try{
        int n = sc.nextInt();
        int[] a = new int[n];
    }
    catch(Exception e){
        System.out.println("Size should be positive");

    }
 }
}
