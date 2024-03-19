package com.Practice;

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.next();

        int vc=0,cc=0,nc=0,spc=0;

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if (ch <= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                        ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    vc++;
                }
                else{
                    cc++;
                }
            }
           else  if(ch>='0'&& ch<='9'){
                nc++;
            }
           else{
               spc++;
            }
        }
        System.out.println("vowels:"+vc+" "+"consonants:"+cc+" "+"Numbers:"+nc+" "+"special:"+spc+" ");
    }
}
