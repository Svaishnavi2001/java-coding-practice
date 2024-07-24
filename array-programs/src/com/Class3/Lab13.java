package com.Class3;
import java.util.Scanner;
// Reverse of a given number.
public class Lab13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        reverseNum(n);
    }
    private static void reverseNum(int n) {
        int rev=0;
        while(n>0){
           int temp=n%10;
           rev=rev*10+temp;
           n=n/10;
        }
        System.out.println(rev);
    }
}
