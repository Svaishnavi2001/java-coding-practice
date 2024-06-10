package collection_basic_concepts;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeTraversing {
    public static void main(String[] args) {

        TreeSet<Integer> set=new TreeSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        System.out.println("\nUsing for each loop:");
        for(Integer number: set){
            System.out.println(number);
        }

        System.out.println("\nUsing iterator:");
        Iterator<Integer> iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing for each method:");
        set.forEach(number->System.out.println(number));
    }
}
