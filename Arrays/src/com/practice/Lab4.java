package com.practice;
import java.util.Scanner;
public class Lab4 {
    public static void main(String[] args) {
        boolean a[]=new boolean[5];
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<=4;i++){
            System.out.println("Enter the marriage Status");
            a[i]=scan.nextBoolean();
        }
        System.out.println("The marriage status are:");
        for(int j=0;j<=4;j++){
            System.out.println(a[j]+" ");
        }
    }
}
