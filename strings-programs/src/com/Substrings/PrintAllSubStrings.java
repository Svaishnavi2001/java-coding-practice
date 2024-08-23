package com.Substrings;

// Print all substring of a given string

public class PrintAllSubStrings {
    public static void main(String[] args) {


        String s="mississippi";

        printAllSubstring(s);
    }

    private static void printAllSubstring(String s) {

        for (int size = 1; size<=s.length(); size++) {

            for (int i = 0; i <= s.length() - size; i++) {
                String t = "";
                for (int j = i; j < size + i; j++) {
                    t = t + s.charAt(j);
                }
                System.out.println(t);
            }

        }
    }
}
