package com.Class2;
import java.util.Scanner;
// Print 1st n prime numbers.
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        printPrimeNums(n);
    }
    private static void printPrimeNums(int n) {
        int count=0;
        for(int i=1;count<n;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
                count++;
            }
        }
    }
    private static boolean isPrime(int n) {
           if(n==1){
           return false;
        }
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
