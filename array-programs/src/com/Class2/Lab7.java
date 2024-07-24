package com.Class2;
import java.util.Scanner;
// Print prime numbers from 1 to n.
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        printPrimeNum(n);
    }
    private static void printPrimeNum(int n) {
    for(int i=1;i<=n;i++){
    if(isPrime(i)==true){
        System.out.print(i+ " ");
      }
     }
    }
    private static boolean isPrime(int n) {
        if(n==1){
            return false;
        }
        for(int i=2;i<=n-1;i++) {
            if (n % i == 0) {
                return false;
            }
        }
            return true;
        }
}
