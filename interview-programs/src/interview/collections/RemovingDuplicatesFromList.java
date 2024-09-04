package interview.collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemovingDuplicatesFromList {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<Integer>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(7);
        list.add(10);

        System.out.println(list+" ");

        Set<Integer> removeDuplicates=new LinkedHashSet<Integer>(list);

        list.clear();

        list.addAll(removeDuplicates);
        System.out.print(list+" ");

    }
}
