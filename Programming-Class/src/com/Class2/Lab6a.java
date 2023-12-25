package com.Class2;
import java.util.Scanner;
// Whether the given number is Prime or not.
public class Lab6a {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        isPrimeOrNot(n);
    }
    public static void isPrimeOrNot(int n) {
        int count=0;
        for(int i=2;i<=n-1;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==0){
            System.out.println(" Prime");
        }
        else{
            System.out.println(" Not a Prime");
        }
    }
}
