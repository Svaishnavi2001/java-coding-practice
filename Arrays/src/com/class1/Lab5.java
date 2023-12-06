package com.class1;
import java.util.Scanner;
public class Lab5 {
    public static void main(String[] args) {
        float a[]=new float[5];
        Scanner scan=new Scanner(System.in);

        for(int i=0;i<=4;i++){
            System.out.println("Enter the height");
            a[i]=scan.nextFloat();
        }
        System.out.println("The heights are:");
        for(int j=0;j<=4;j++){
            System.out.println(a[j]+" ");
        }
    }
}
