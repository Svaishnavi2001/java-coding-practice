package com.Cls1;
import java.util.Scanner;
// Remove Special characters from a String.
public class Lab8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        removeSpecialChars(s);
    }
    private static void removeSpecialChars(String s) {

        String res="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z') || (ch>='0'&& ch<='9')|| ch==' '){
                res=res + ch;
            }
        }
        System.out.println(res);
    }
}
