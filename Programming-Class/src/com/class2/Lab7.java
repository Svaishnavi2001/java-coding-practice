package com.class2;
import java.util.Scanner;
// Whether the given number is Prime or not.
public class Lab7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        printFactors(n);
    }
    private static void printFactors(int n) {
        int count=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println("prime");
        }
        else{
            System.out.println("Not a Prime");
        }
    }
}
