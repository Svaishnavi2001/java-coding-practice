package com.Collections_Framework;

import java.util.LinkedList;

public class Demo3 {
    public static void main(String[] args) {
        LinkedList lst=new LinkedList();

        lst.add(10);
        lst.add(20);
        lst.add(30);

        System.out.println(lst);

        //lst.addFirst(50);
        //System.out.println(lst);

        System.out.println(lst.peek());
        System.out.println("After peek():" +lst);

        System.out.println(lst.pop());
        System.out.println("After poll():"+lst);

    }
}
