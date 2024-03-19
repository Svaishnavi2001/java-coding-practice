package com.Class2;
import java.util.Scanner;
// Check whether the  given string is Palindrome or not.
public class Lab2 {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String s=scan.next();

            String rev=reverseString(s);

            if(s.equals(rev)) {
                System.out.println("palindrome");
            }
            else{
                System.out.println("not palindrome");
            }
        }

        private static String reverseString(String s) {

         String rev="";

         for(int i=s.length()-1;i>=0;i--){
             rev=rev+s.charAt(i);
         }
         return rev;


    }
}
