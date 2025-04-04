package com.Substring_programs;

//Check whether a subString is  present in a given String

import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

         String s=sc.nextLine();
         String s1=sc.nextLine();
         int size=s1.length();

        System.out.println(findSubString(s,size,s1));
    }

    private static String  findSubString(String s, int size,String s1) {

        for(int i=0;i<=s.length()-size;i++){
             String t="";
             for(int j=i;j<size+i;j++){
                t=t+s.charAt(j);
             }
             if(t.equals(s1)){
                 return "Yes";
             }
        }
        return "No";
    }
}
