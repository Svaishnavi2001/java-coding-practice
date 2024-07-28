package interview.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachWordInString {

    public static void main(String[] args) {

        String s = "hello world hello";
        String[] str = s.split(" ");

        Map<String, Integer> stringIntegerMap=new LinkedHashMap<>();
        for(int i=0;i<str.length;i++){
            int count=1;
            if(stringIntegerMap.containsKey(str[i])){

               count=count+stringIntegerMap.get(str[i]);

               stringIntegerMap.put(str[i], count);
            }
            else{
                stringIntegerMap.put(str[i],1);
            }
        }

        Set<Map.Entry<String,Integer>> entry=stringIntegerMap.entrySet();
        for(Map.Entry<String,Integer> stringIntegerEntry:entry){
            System.out.println(stringIntegerEntry.getKey()+":"+stringIntegerEntry.getValue());
        }
    }
}
