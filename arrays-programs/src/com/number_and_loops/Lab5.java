package com.number_and_loops;
import java.util.Scanner;
// Print the count of factors of a given number.
public class Lab5 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       int n=scan.nextInt();
       countFactors(n);
    }
    private static void countFactors(int n) {
        int count=0;
        for(int i=1;i<=n;i++) {
            if (n % i == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
