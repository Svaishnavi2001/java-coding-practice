package interview.collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class freqOfEachCharInString {

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
        Set<Map.Entry<Character, Integer>> characterIntegerEntry=stringIntegerMap.entrySet();
        for(Map.Entry<Character, Integer> characterIntegerEntry1:characterIntegerEntry){
            System.out.println(characterIntegerEntry1.getKey()+":"+characterIntegerEntry1.getValue());
        }
    }
}
