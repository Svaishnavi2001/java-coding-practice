package com.basic_programs;
// Removing in between spaces

import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        removeBetweenSpaces(s);
    }

    private static void removeBetweenSpaces(String s) {

        int si = 0, ei = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' ') {
                si = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i)!=' '){
            ei = i;
            break;
            }
        }
        String res = "";
        for (int i = si; i <= ei; i++) {
            if (s.charAt(i) != ' ' || s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                     res = res + s.charAt(i);
            }
        }
        System.out.println(res);
    }
}