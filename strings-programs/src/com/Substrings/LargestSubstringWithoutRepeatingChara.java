package com.Substrings;

import java.util.HashSet;
import java.util.Set;

public class LargestSubstringWithoutRepeatingChara {
    public static void main(String[] args) {

        String sts="mississippi";

        largestSubString(sts);
    }

    private static void largestSubString(String str) {

        Set<Character> set=new HashSet<>();

        for(int s=str.length();s>=1;s--){
            for(int i=0;i<=str.length()-s;i++){
                for(int j=i;j<i+s;j++){
                    set.add(str.charAt(j));
                }
            }
            StringBuilder sb=new StringBuilder();
            for(char ch:set){
                sb.append(ch);
            }
            System.out.println(sb.toString());
            return;
        }
    }
}
