package com.basic_programs;
// finding a specific character
import java.util.Scanner;

public class Lab15 {
    public static void  main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        char k=sc.next().charAt(0);

        int res=findCharacter(s,k);
        System.out.println(res);
    }

    private static int findCharacter(String s, char k) {

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==k){
                return  i;
            }
        }
        return -1;
    }
}
