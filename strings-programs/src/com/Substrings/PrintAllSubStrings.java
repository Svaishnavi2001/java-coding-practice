package com.Substrings;
// Print all substrings of given size  of string
import java.util.Scanner;

public class PrintAllSubStrings {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
         String s=sc.nextLine();
         int size=sc.nextInt();
         
         printSubStrings(s,size);
         
    }

    private static void printSubStrings(String s, int size) {

        for(int i=0;i<=s.length()-size;i++){
            String t="";
            for(int j=i;j<size+i;j++){
                t=t+s.charAt(j);
            }
            System.out.println(t);
        }
    }
}
