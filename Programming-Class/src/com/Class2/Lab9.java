package com.Class2;
import java.util.Scanner;
// Common multiples of given 2 numbers.
public class Lab9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();
        int x=scan.nextInt();
        commonMultiple(n1, n2, x);
    }

    private static void commonMultiple(int n1, int n2, int x) {
        for(int i=1;i<x;i++){
            if(i%n1==0 && i%n2==0){
                System.out.println(i);
               //  return; --> it return only 1 value
            }
        }
    }
}
