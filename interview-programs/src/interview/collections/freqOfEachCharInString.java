package interview.collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class freqOfEachCharInString {

    public static void main(String[] args) {

        String str="hello world hello";
        char []charArray=str.toCharArray();

        Map<Character, Integer> map=new LinkedHashMap<>();

        for(int i=0;i<charArray.length;i++){
            int flag=1;
            if(map.containsKey(charArray[i])){

                flag=flag+map.get(charArray[i]);

                map.put(charArray[i],flag);

                }
            else{
                map.put(charArray[i],1);
            }
        }
        Set<Map.Entry<Character, Integer>> entry=map.entrySet();
        for(Map.Entry<Character, Integer> entry1:entry){
            System.out.println(entry1.getKey()+":"+entry1.getValue());
        }
    }
}
