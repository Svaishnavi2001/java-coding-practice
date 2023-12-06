package com.class1;
import java.util.Scanner;
public class Lab6 {
    public static void main(String[] args) {
        int a[][]=new int[2][5];
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<=1;i++) {
            for (int j=0;j<=4;j++){
                System.out.println("Enter the age of class "+(i+1)+" of student "+(j + 1));
                a[i][j] = scan.nextInt();
            }
        }
        System.out.println("The age of students are:");
        for(int i=0;i<=1;i++){
            for(int j=0;j<=4;j++){
                System.out.println(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
