package interview.string_prgs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String str="mississippi";
        char[] chars=str.toCharArray();

        Map<Character,Integer> characterIntegerMap=new LinkedHashMap<>();

        for(int i=0;i<chars.length;i++){
            int flag=1;
              if(characterIntegerMap.containsKey(chars[i])){

                  flag=flag+characterIntegerMap.get(chars[i]);

                  characterIntegerMap.put(chars[i], flag);
              }
              else{
                  characterIntegerMap.put(chars[i],1);
              }

        }
        System.out.println(characterIntegerMap);
    }
}
