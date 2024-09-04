package interview.strings;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pangram {
    public static void main(String[] args) {

        String s="The quick brown fox jumps over the lazy dog.";

        boolean isPangram=pangramCheck(s);
        if(isPangram){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
    }
    private static  boolean pangramCheck(String s){

         s=s.toLowerCase();
         char charArray[]=s.toCharArray();

         Set<Character> set=new LinkedHashSet<>();
         for(char ch:charArray){
             if(ch>='a'&& ch<='z'){
                 set.add(ch);
             }
         }
         return set.size()==26;
    }
}
