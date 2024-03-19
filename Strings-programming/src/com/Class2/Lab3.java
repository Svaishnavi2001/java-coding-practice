package com.Class2;
import java.util.Scanner;
// Print the spaces of a given string
public class Lab3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        printSpaces(s);
    }
    private static void printSpaces(String s) {
        int count=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == ' ') {
                count++;
            }
        }
            System.out.println(count);
        }
    }

