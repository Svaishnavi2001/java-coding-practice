package com.Cls2;

//check whether a second string present in first string

import java.util.Scanner;

public class Lab16 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String t = sc.next();

        findString(s, t);
        //System.out.println(res);
    }

    private static void findString(String s, String t) {

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }
            if (j == t.length()) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            //return j==t.length()?"Yes":"No";
        }
    }
