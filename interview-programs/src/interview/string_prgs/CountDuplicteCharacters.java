package interview.string_prgs;

import java.util.HashSet;
import java.util.Set;

public class CountDuplicteCharacters {
    public static void main(String[] args) {

        String str="vaishnavi";

        char[] ch=str.toCharArray();
        Set<Character> characterSet = new HashSet<>();
        for(char character:ch){
           characterSet.add(character);
        }
        System.out.println(characterSet);

        String result= "";
        for( char c: characterSet){
            result = result + c;
        }
        System.out.println(result);
    }
}
