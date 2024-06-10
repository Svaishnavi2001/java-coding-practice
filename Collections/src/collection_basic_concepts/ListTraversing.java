package collection_basic_concepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ListTraversing {
    public static void main(String[] args) {


        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Cherry");
        list.add("Banana");
        list.add("Date");
        list.add("Fig");


        System.out.println("Using for loop(index based):");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("\nUsing for-each loop:");
        for(String fruit : list){
            System.out.println(fruit);
        }

        System.out.println("\nUsing iterator:");
        Iterator<String>iterator= list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing list-iterator:");
        ListIterator<String> listIterator=list.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing list-iterator backward:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("\nUsing for-each method:");
        list.forEach(fruit-> System.out.println(fruit));

        System.out.println("\nUsing Streams ");
        list.stream().forEach(fruit-> System.out.println(fruit));

        System.out.println("\nUsing parallel Streams:");
        list.parallelStream().forEach(fruit-> System.out.println(fruit));
    }
}
