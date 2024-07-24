package interview.string_prgs;


import java.util.LinkedHashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args) {

        String str="mississippi";
        char[] charArray=str.toCharArray();

        Map<Character,Integer> map=new LinkedHashMap<>();

        for(int i=0;i<charArray.length;i++){
            int flag=1;
              if(map.containsKey(charArray[i])){

                  flag=flag+map.get(charArray[i]);

                  map.put(charArray[i], flag);
              }
              else{
                  map.put(charArray[i],1);
              }

        }
        System.out.println(map);
    }
}
