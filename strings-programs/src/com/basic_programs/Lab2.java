package com.basic_programs;

// Check whether the  given string is Palindrome or not.
// Using 2 pointer technique
public class Lab2 {

    public static void main(String[] args) {

        String s="abcba";

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
