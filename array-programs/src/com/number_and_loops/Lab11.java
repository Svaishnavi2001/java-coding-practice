package com.number_and_loops;
import java.util.Scanner;
// Count the digits of a given number.
public class Lab11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        countDigits(n);
    }
    private static void countDigits(int n) {
        int count = 0;

        while(n!=0){
            n=n/10;
            count++;
        }
        System.out.println(count);
    }
}
