package interview.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachCharacterInString {
    public static void main(String[] args) {

        String s = "aabbbccccddddd";
        char[] charArray = s.toCharArray();

        Map<Character,Integer> stringIntegerMap=new LinkedHashMap<>();
        for(int i=0;i<charArray.length;i++){
            int count=1;
            if(stringIntegerMap.containsKey(charArray[i])){

                count=count+stringIntegerMap.get(charArray[i]);

                stringIntegerMap.put(charArray[i], count);
            }
            else{
                stringIntegerMap.put(charArray[i],1);
            }
        }

        Set<Map.Entry<Character,Integer>> entries=stringIntegerMap.entrySet();
        for(Map.Entry<Character,Integer> entry:entries){
            System.out.println(entry.getKey()+"-"+entry.getValue());
        }
    }
}
