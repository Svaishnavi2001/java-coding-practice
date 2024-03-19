package com.Practice;
// count consonants
public class Lab2 {
    public static void main(String[] args) {

        String s="TapAcademy";
        int count=0;

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if((ch>='a'&& ch<='z')||(ch>='A')&& ch<='Z'){
                if(!(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                        ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')) {

                    count++;
            }
            }
        }
        System.out.println(count);
    }
}
