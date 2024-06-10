package sets_maps_programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class FreqOfCharInString {

    public static void main(String[] args) {

              String str="mississippi";

              LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
              for(int i=0;i<str.length();i++){
                  char ch=str.charAt(i);
                  if(map.containsKey(ch)){

                      Integer value=map.get(ch);
                      value=value+1;
                      map.put(ch,value);
                  }
                  else {
                      map.put(ch, 1);
                  }
              }
        System.out.println(map);

        Set<Character> keys=map.keySet();
        String res="";
        for(char key: keys){
            res=res+key+map.get(key);
        }
        System.out.println(res);
    }
}
