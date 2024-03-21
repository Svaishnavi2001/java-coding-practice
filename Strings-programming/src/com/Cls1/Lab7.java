package com.Cls1;
import java.util.Scanner;
// Print count of Vowels,Consonants,Digits and Special characters of a String
public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        countVowelConsonant(s);
    }
    private static void countVowelConsonant(String s) {
        int vc=0,cc=0,nc=0,sc=0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if((ch>='A'&& ch<='Z')||(ch>='a'&& ch<='z')) {
                if ((ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {
                    vc++;
                } else {
                    cc++;
                }
            }
                else if(ch>='0' && ch<='9'){
                    nc++;
                }
                else{
                    sc++;
            }
        }
        System.out.println("vowels:"+vc +" Consonants:"+cc +" Digits:"+nc +" Special characters:"+sc);
    }
}
