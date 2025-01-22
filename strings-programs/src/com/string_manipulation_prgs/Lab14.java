package com.string_manipulation_prgs;

/*s=banana
t=b*an*an*a*/

import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        String t="";
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='a'){
                 t=t+ '*' +s.charAt(i);
             }
             else{
                 t=t+s.charAt(i);
             }
        }
        System.out.println(t);
    }
}
