package interview.string_prgs;

// removing duplicate elements from string
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String str="Banana";
        char[] charArray=str.toCharArray();

        Set<Character> removeDuplicates=new LinkedHashSet<Character>();
        for(char ch: charArray){
            removeDuplicates.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: removeDuplicates){
            sb.append(ch);
        }
        System.out.println(sb.toString());
    }
}
