package com.practice;
import java.util.Scanner;
public class Lab3 {
    public static void main(String[] args) {
        int a[]=new int[5];
        Scanner scan=new Scanner(System.in);
       for(int i=0;i<=4;i++){
           System.out.println("Enter the age of"+(i+1)+ "Student");
           a[i]=scan.nextInt();
         }
        System.out.println("The ages are:");
        for(int j=0;j<=4;j++){
            System.out.println(a[j]+" ");

       }
    }
}
