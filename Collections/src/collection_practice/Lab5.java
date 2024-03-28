package collection_practice;

// ArrayDeque and priority queue

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Lab5 {
    public static void main(String[] args) {

        ArrayDeque ad=new ArrayDeque();
        ad.add(50);
        ad.add(40);
        ad.add(30);
        ad.add(20);
        ad.add(10);
        ad.add(60);
        System.out.println("ArrayDeque:"+ad);

        PriorityQueue pq=new PriorityQueue();
        pq.add(60);
        pq.add(50);
        pq.add(40);
        pq.add(30);
        pq.add(20);
        pq.add(10);
        System.out.println("Priority Queue:"+pq);

    }
}
