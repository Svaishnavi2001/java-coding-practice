package sets_maps_programs;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {

        int[] ar={50,20,10,30,20,40,10};
        for(int num:ar){
            System.out.print(num+" ");
        }
        System.out.println();
        TreeSet<Integer> set=new TreeSet<>();
        for(int num: ar){
            set.add(num);
        }

        System.out.println(set);
    }
}
