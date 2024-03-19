package collection_practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class Lab1 {
    public static void main(String[] args) {

        ArrayList al=new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);

        System.out.println("Arraylist:"+" "+al);

        LinkedList ll=new LinkedList(al);

        System.out.println("Linkedlist:"+ " "+ll);
    }


}
