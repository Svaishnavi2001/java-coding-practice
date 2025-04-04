package com.basic_programs;

//lowercase to uppercase

import java.util.Scanner;

public class Lab11 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        lowerToUpperCase(s);

    }
    private static void lowerToUpperCase(String s) {

        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='a'&& ch<='z'){
                res=res+(char)(ch-32);
            }
        }
        System.out.println(res);
    }
}
