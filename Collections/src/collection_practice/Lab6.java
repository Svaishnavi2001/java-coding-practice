package collection_practice;
// Set (TreesSet,HashSet and LinkedHashSet)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Lab6 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(5);
        al.add(1);
        al.add(4);
        al.add(3);
        al.add(2);
        al.add(1);
        System.out.println(al);

        TreeSet ts=new TreeSet(al);
        System.out.println("TreeSet:"+ts);

        HashSet hs=new HashSet(al);
        System.out.println("HashSet:"+hs);

        LinkedHashSet lhs=new LinkedHashSet(al);
        System.out.println("LinkedHashSet:"+lhs);

    }
}
