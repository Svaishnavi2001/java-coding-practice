package com.Cls1;
import java.util.Scanner;
// print the count of Consonants in a given String.
public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        countConsonants(s);
    }
    private static void countConsonants(String s) {
        int count=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!(ch=='a' || ch=='e' || ch=='i'|| ch=='o'|| ch=='u'||
                    ch=='A' || ch=='E'|| ch=='I'|| ch=='O'|| ch=='U'))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}