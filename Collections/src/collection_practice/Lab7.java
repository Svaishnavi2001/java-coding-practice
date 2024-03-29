package collection_practice;
//  Sorting complex objects in collections

import java.util.ArrayList;
import java.util.Collections;

public class Lab7 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(50);
        al.add(30);
        al.add(10);
        al.add(40);
        al.add(20);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
    }
}
