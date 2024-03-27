package collection_practice;
// ListIterator
import java.util.LinkedList;
import java.util.ListIterator;

public class Lab4 {
    public static void main(String[] args) {

        LinkedList lst=new LinkedList();
        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        lst.add(60);
        lst.add(70);
        System.out.println(lst);

        ListIterator li=lst.listIterator();
        while(li.hasNext()){
            System.out.print(li.next()+" ");
        }
        System.out.println();
        while(li.hasPrevious()){
            System.out.print(li.previous()+" ");
        }
    }
}
