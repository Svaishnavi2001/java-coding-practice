package interview.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FrequencyOfEachWordInString {

    public static void main(String[] args) {

        String s = "hello world hello";
        String[] str = s.split(" ");

        Map<String, Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length;i++){
            int count=1;
            if(map.containsKey(str[i])){

               count=count+map.get(str[i]);

                map.put(str[i], count);
            }
            else{
                map.put(str[i],1);
            }
        }

        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}
