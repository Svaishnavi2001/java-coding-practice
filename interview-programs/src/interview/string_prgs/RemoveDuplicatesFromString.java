package interview.string_prgs;
// removing duplicate elements from string

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {

        String str="Banana";

       String res= removeDuplicates(str);
        System.out.println(res);

    }

    private static String  removeDuplicates(String str) {

        Set<Character> removeDuplicates=new LinkedHashSet<Character>();
        for(char ch: str.toCharArray()){
            removeDuplicates.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: removeDuplicates){
            sb.append(ch);
        }
        return sb.toString();
    }
}
