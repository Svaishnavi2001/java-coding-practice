package collection_practice;
// Linked list
import java.util.LinkedList;

public class Lab2 {
    public static void main(String[] args) {

        LinkedList lst=new LinkedList();
//
//        lst.push(10);
//        lst.push(20);
//        lst.push(30);
//        lst.push(40);
//        lst.push(50);
//
//        System.out.println(lst);
//
//        lst.pop();
//        System.out.println(lst);

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);

        System.out.println(lst);

        System.out.println(lst.peek());

        System.out.println("After peek():"+lst);

        System.out.println(lst.poll());

        System.out.println("After poll():"+lst);
    }
}
