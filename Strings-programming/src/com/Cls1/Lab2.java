package com.Cls1;
import java.util.Scanner;
// Check whether the  given string is Palindrome or not.
public class Lab2 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();

//            String rev=reverseString(s);
//
//            if(s.equals(rev)) {
//                System.out.println("palindrome");
//            }
//            else{
//                System.out.println("not palindrome");
//            }
//        }
//
//        private static String reverseString(String s) {
//
//         String rev="";
//
//         for(int i=s.length()-1;i>=0;i--){
//             rev=rev+s.charAt(i);
//         }
//         return rev;
        String res=palindromeOrNot(s);
        System.out.println(res);
    }

    private static String palindromeOrNot(String s) {

        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;j--;
            }
            else{
                return "Not Palindrome";
            }
        }
        return "Palindrome";

    }
}
