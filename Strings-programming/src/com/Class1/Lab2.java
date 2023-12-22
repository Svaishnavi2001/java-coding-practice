package com.Class1;
import java.util.Scanner;
// Check whether the  given string is Palindrome or not.
public class Lab2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        reverse(s);
    }
    private static void reverse(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if (s.equals(rev)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
