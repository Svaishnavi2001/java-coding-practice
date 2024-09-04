package interview.strings;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        boolean isAnagram=anagramCheck(str1,str2);
        //System.out.println(isAnagram);
        if(isAnagram){
            System.out.println("anagrams");
        }
        else{
            System.out.println("not anagrams");
        }

    }
    private static boolean anagramCheck(String str1, String str2) {
        // remove spaces and convert to lowercase
        str1=str1.replaceAll("\\s","").toLowerCase();
        str2= str2.replaceAll("\\s","").toLowerCase();

        if(str1.length()!=str2.length()){
            return false;
        }
        char []charArray1= str1.toCharArray();
        char [] charArray2=str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1,charArray2);
    }
}
