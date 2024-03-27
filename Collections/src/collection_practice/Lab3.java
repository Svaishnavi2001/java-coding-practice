package collection_practice;
// Enumeration and iterator

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class Lab3 {
    public static void main(String[] args) {

//        Vector v =new Vector();
//
//        v.add(10);
//        v.add(20);
//        v.add(30);
//        v.add(40);
//        v.add(50);
//
//        System.out.println(v);
//
//        Enumeration e= v.elements();
//        while(e.hasMoreElements()){
//            System.out.println(e.nextElement());
//        }

        LinkedList lst=new LinkedList();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        System.out.println(lst);

        Iterator itr=lst.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
