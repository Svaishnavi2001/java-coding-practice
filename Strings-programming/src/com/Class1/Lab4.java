package com.Class1;

public class Lab4 {
    public static void main(String[] args) {

        String s = "Tap Acad@123";
        String res="";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if ((ch >='A' && ch <= 'Z' )|| (ch >= 'a' && ch <= 'z')||(ch>='0' && ch<='9') ){
                          res=res+ch;
                }
            }
        System.out.println(res);
        }
    }
