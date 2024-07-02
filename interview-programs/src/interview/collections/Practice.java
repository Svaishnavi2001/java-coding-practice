package interview.collections;


import java.util.LinkedHashMap;
import java.util.Map;

public class Practice {

    public static void main(String[] args) {

        String str="hello world hello";
        char []chars=str.toCharArray();

        Map<Character, Integer> stringIntegerMap=new LinkedHashMap<>();

        for(int i=0;i<chars.length;i++){
            int flag=1;
            if(stringIntegerMap.containsKey(chars[i])){

                flag=flag+stringIntegerMap.get(chars[i]);

                stringIntegerMap.put(chars[i],flag);

                }
            else{
                stringIntegerMap.put(chars[i],1);
            }
        }
        System.out.println(stringIntegerMap);
    }
}
