package com.number_and_loops;
import java.util.Scanner;
// Print prime numbers between n1 and n2
public class Lab7a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n1=scan.nextInt();
        int n2=scan.nextInt();

        printPrimeNumbers(n1,n2);
    }
    private static void printPrimeNumbers(int n1, int n2) {
        for(int i=n1;i<=n2;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
            }
        }
    }
    private static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
