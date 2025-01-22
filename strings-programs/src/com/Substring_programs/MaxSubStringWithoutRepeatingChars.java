package com.Substring_programs;

import java.util.LinkedHashSet;
import java.util.Set;

public class MaxSubStringWithoutRepeatingChars {
    public static void main(String[] args) {

        String sts="mississippi";

        largestSubString(sts);
    }

    private static void largestSubString(String str) {

        Set<Character> set=new LinkedHashSet<>();

        for(int s=str.length();s>=1;s--){
            for(int i=0;i<=str.length()-s;i++) {
                for (int j = i; j < i + s; j++) {
                    set.add(str.charAt(j));
                }

                StringBuilder sb = new StringBuilder();
                for (char ch : set) {
                    sb.append(ch);
                }
                System.out.println(sb);
                return;
            }
        }
    }
}
