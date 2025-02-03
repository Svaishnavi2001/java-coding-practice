package substrings;

import java.util.HashSet;
import java.util.Set;

public class LongestSubStringWithoutRepeatingChars {
    public static void main(String[] args) {
        String s = "abcabcabb";
        int res=longestUniqueSubString(s);
        System.out.println(res);
    }
    private static int longestUniqueSubString(String s){
        int l=0;
        int maxLength=0;
        String longestSubString="";

        Set<Character> set=new HashSet<>();

        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));

            int currentLength=r-l+1;
            if(currentLength>maxLength){
                maxLength=currentLength;
                longestSubString=s.substring(l,r+1);
            }
        }
         return longestSubString.length();
    }
}
