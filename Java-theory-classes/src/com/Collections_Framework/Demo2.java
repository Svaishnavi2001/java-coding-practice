package com.Collections_Framework;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo2 {
    public static <object> void main(String[] args) {
        ArrayList al1=new ArrayList();
        ArrayList al2=new ArrayList();


        al1.add(10);
        al1.add(20);
        al1.add(30);

        al2.add("Sachin");
        al2.add("Sneha");
        al2.add("Riya");

        System.out.println(al1);
        System.out.println(al2);

        //al1.add(al2);
        //System.out.println(al1);

        // al1.addAll(al2);
        //System.out.println(al1);

        // al1.add(3,al2);
        // System.out.println(al1);

        //al1.addAll(3,al2);
        //System.out.println(al1);

        //al1.clear();
        //System.out.println(al1);

         ArrayList al3=(ArrayList) al1.clone();
         //System.out.println(al3);

        //System.out.println(al1.contains(40));
        //System.out.println(al1.contains(20));

        //System.out.println(al1.containsAll(al2));
        //System.out.println(al1.containsAll(al3));

        //System.out.println(al1.equals(al3));

        //System.out.println(al1.get(2));

        //for(int i=0;i<al1.size();i++){
        //    System.out.println(al1.get(i));
       // }

         Iterator itr=al1.iterator();
        //while(itr.hasNext()==true){
        //   System.out.println(itr.hasNext());
        // }

        //for(Object x:al1){
        //    System.out.println(x);
        //}
    }
}
