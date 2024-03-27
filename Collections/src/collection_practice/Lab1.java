package collection_practice;
// ArrayList
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

        System.out.println("ArrayList:"+al);

        LinkedList lst=new LinkedList(al);
        System.out.println("LinkedList:"+lst);

        lst.addFirst(60);
        System.out.println(lst);

    }
}
