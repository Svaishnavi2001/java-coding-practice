package interview.string_prgs;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1="listen";
        String str2="silent";

        boolean res=anagramOfStrings(str1,str2);
        System.out.println(res);

    }
    private static boolean anagramOfStrings(String str1, String str2) {

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
