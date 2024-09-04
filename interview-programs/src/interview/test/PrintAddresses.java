package interview.test;

import java.util.*;

public class PrintAddresses {
    public static void main(String[] args) {

        String s="laxmi@gmail.com,sneha@gmail.com,vaishnavi@gmail.com";
        String[] str=s.split(",");

        // using set
        Set<String> set=new TreeSet<>();
        for(String string:str){
            set.add(string);
        }
        System.out.println(set.toString());
        System.out.println();

        // using Arrays
        Arrays.sort(str);

        for(int i=0;i<str.length;i++){
            System.out.println(str[i]+" ");
        }
    }

    public static class freqOfEachCharInString {

        public static void main(String[] args) {

            String str="aabbbccccddddd";
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
            Set<Character> keys=map.keySet();
            for(char key:keys){
                System.out.println(key);
            }
            System.out.println();

            Collection<Integer> values=map.values();
            for(int value:values){
                System.out.println(value);
            }
            System.out.println();

            Set<Map.Entry<Character, Integer>> entries=map.entrySet();
            for(Map.Entry<Character, Integer> entry:entries){
                System.out.println(entry.getKey()+"-"+entry.getValue());
            }
        }
    }
}
