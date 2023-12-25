package com.Class1;
import java.util.Scanner;
// Print a program to Reverse of a string
public class Lab1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        String rev=reverse(s);
        System.out.println(rev);
    }
    private static String reverse(String s){
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        return rev;
    }
}
