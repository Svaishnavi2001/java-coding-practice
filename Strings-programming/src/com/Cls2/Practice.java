package com.Cls2;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s=sc.nextLine();

        int si=0,ei=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '){
                si=i;
                break;
            }
        }
        for(int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) != ' ') {
                ei = i;
                break;
            }
        }
        String res="";





















//        String s=sc.next();
//
//        String res="";
//        for(int i=0;i<s.length();i++) {
//            char ch = s.charAt(i);
//            if (ch >= 'a' && ch <= 'z') {
//                res = res + (ch - 32);
//            }
//        }
//        System.out.println(res);
    }
}
