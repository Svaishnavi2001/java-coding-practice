package com.Substrings;

// Converting String to Array

import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        stringToArray(s);
    }

    public static int countWords(String s) {
         int count=0;
         for(int i=0;i<s.length()-1;i++){
             if(s.charAt(i)==' ' && s.charAt(i+1)!=' '){
                 count++;
             }
         }
         return count+1;

    }
    public static String[] stringToArray(String s){

        String []ar=new String[countWords(s)];
        String t="";
        int j=0;
        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){
                t=t+s.charAt(i);
            }
            else if(t.length()>0){
                ar[j]=t;
                j++;
                t="";
            }
        }
        ar[j]=t;

    for(int i=0;i<ar.length;i++) {
            System.out.println(ar[i]);
        }
        return ar;
    }
}
