package com.Class1;
// count the vowels
public class Lab1 {
    public static void main(String[] args) {

        String s = "JaVa";
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||
                        ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    count++;
                }
            }
        }
            System.out.print(count);

    }
}