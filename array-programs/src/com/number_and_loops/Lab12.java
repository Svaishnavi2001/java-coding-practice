package com.number_and_loops;
import java.util.Scanner;
// Sum of digits of a given number.
public class Lab12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        sumOfDigits(n);
    }
    private static void sumOfDigits(int n) {
        int sum=0;
        while(n>0){
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println(sum);
    }
}
