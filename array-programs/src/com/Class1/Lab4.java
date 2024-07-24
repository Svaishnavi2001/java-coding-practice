package com.Class1;
import java.util.Scanner;
// Print the factors of a given number.
public class Lab4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        printFactors(n);
    }
    private static void printFactors(int n) {
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println(i);
            }
        }
    }
}
