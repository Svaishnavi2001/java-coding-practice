package sets_maps_programs;

import java.util.*;

public class ListSetMap {
    public static <Entry, TreeSet> void main(String[] args) {

       /* ArrayList<Integer> al=new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(10);
        System.out.println(al);

        LinkedList<Integer> lst=new LinkedList<>();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        lst.add(10);
        System.out.println(lst);

        HashSet<Integer> s=new HashSet<>();
        s.add(10);
        s.add(30);
        s.add(20);
        s.add(10);
        s.add(40);
        s.add(20);
        s.add(50);
        System.out.println(s);

        LinkedHashSet<Integer> ls=new LinkedHashSet<>();
        ls.add(10);
        ls.add(30);
        ls.add(20);
        ls.add(10);
        ls.add(40);
        ls.add(20);
        ls.add(50);
        System.out.println(ls);

        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(100,"USA");
        hm.put(200,"UK");
        hm.put(500,"SK");
        hm.put(700,"NK");
        hm.put(1000,"SA");
        System.out.println(hm);

        Set<Integer> keys=hm.keySet();
        for(int key:keys){
            System.out.println(key+" "+hm.get(key));
        }

        Set<Map.Entry<Integer,String>> entrys=hm.entrySet();
        for(Map.Entry<Integer,String> entry: entrys){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/

        TreeMap<String,Integer> tm=new TreeMap<>();
        tm.put("USA",100);
        tm.put("UK",500);
        tm.put("SK",200);
        tm.put("NK",1000);
        tm.put("SA",700);
        System.out.println(tm);

        Set<String> keys1=tm.keySet();
        for(String key1: keys1){
            System.out.println(key1+" "+tm.get(key1));
        }

        System.out.println();

        Set<Map.Entry<String,Integer>> entrys1= tm.entrySet();
        for(Map.Entry<String,Integer> entry1: entrys1){
            System.out.println(entry1.getKey()+" "+entry1.getValue());
        }









    }
}
