package interview.collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateStrings {
    public static void main(String[] args) {

        String s="fear leads to anger anger leads to hate hate leads to suffer suffer leads to pain ";

        String []str=s.split(" ");

        Map<String ,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<str.length;i++){
            int flag=1;
            if(map.containsKey(str[i])){

                flag=flag+map.get(str[i]);

                map.put(str[i],flag);
            }
            else{
                map.put(str[i],1);
            }
        }
        // using keySet
        Set<String> keys=map.keySet();
        for(String key:keys){
            if(map.get(key)>3){
                System.out.println(key);
            }
        }
        System.out.println();

        // using entrySet
        Set< Map.Entry<String,Integer>> entries=map.entrySet();
        for(Map.Entry<String,Integer> entry: entries){
            if(entry.getValue()>3){
                System.out.println(entry.getKey());
            }
        }


    }
}
