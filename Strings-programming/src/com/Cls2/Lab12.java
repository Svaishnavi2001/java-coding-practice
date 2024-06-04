package com.Cls2;

//Removing extra spaces from start amd end

import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        removeStartEndSpaces(s);

    }

    private static void removeStartEndSpaces(String s) {

        int si=0,ei=0;
        String res="";

        for(int i=0;i<s.length();i++){

            if(s.charAt(i)!=' '){
                si=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)!=' '){
                ei=i;
                break;
            }
        }
        for(int i=si;i<=ei;i++){
            res=res+s.charAt(i);
        }
        System.out.println(res);
    }
}
