package com.Substrings;
// substring is palindrome or not without length given
import java.util.Scanner;

public class P5 {
    public static void main(String[] args) {

       Scanner sc=new Scanner(System.in);
       String s=sc.nextLine();

       printAllSubstring(s);
    }

    private static void printAllSubstring(String s) {
        for(int size=1;size<=s.length();size++){
            for(int i=0;i<s.length()-size;i++){
                String t="";
                for(int j=i;j<size+i;j++){
                   t= t+s.charAt(j);
                }
                if(isPalindrome(t)){
                    System.out.println(t);
                }
            }
        }
    }
    private static boolean isPalindrome(String t){

        int i=0,j=t.length()-1;
        while(i<j){
            if(t.charAt(i)==t.charAt(j)){
                i++;
                j--;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
