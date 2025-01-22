package com.basic_programs;
import java.util.Scanner;

// Print the words of a given string

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        printWords(s);
    }
    private static void printWords(String s) {
        int count=0;
        for(int i=0;i<s.length()-1;i++) {
            if (s.charAt(i) == ' ' && s.charAt(i + 1) != ' ') {
                count++;
            }
        }
        if(s.charAt(0)==' '){
                System.out.println(count);
            }
            else{
                System.out.println(count+1);
            }
        }
    }



