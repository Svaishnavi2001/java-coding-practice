package collection_basic_concepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashmapTraversing {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(100,"India");
        map.put(200,"Japan");
        map.put(300,"China");
        map.put(400,"Korea");
        map.put(500,"USA");

        System.out.println("iteration over keys:");
        for(Integer key:map.keySet()){
           System.out.println(key);
       }

        System.out.println("\niteration over values:");
        for(String value: map.values()){
            System.out.println(value);
        }

        System.out.println("\niteration over key-value pairs(Entry set):");
        for(Map.Entry<Integer,String> entry: map.entrySet()){
            System.out.println(entry);
        }

        System.out.println("\niteration using iterator:");
        Iterator<Map.Entry<Integer,String>> iterator=map.entrySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing for each method:");
        map.forEach((key, value)-> System.out.println("key:"+key+",value:"+value));

    }
}
