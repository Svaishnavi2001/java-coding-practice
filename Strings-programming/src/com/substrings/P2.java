package com.substrings;

// Check whether a subString is palindrome or not

import java.util.Scanner;

public class P2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int size = sc.nextInt();

        printSubString(s,size);
    }

    private static void printSubString(String s, int size) {

        for (int i = 0; i <= s.length() - size; i++) {
            String t = "";
            for (int j = i; j < size + i; j++) {
                t = t + s.charAt(j);
            }
            if (isPalindrome(t)) {
                System.out.println(t);
            }
        }
    }

    static boolean isPalindrome(String t) {

        int i=0,j=t.length()-1;
        while(i<j){
            if (t.charAt(i) == t.charAt(j)) {
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}