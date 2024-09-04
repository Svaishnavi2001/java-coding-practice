package interview.strings;

// removing duplicate elements from string
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

    public static void main(String[] args) {

        String str="Banana";
        char[] charArray=str.toCharArray();

        Set<Character> set=new LinkedHashSet<Character>();
        for(char ch: charArray){
            set.add(ch);
        }
        StringBuilder sb=new StringBuilder();
        for(char ch: set){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
