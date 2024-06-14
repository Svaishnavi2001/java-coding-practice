package com.Multithreading;

public class SimplPrg {

    public static void main(String[] args) {

        Thread t= Thread.currentThread();
        System.out.println(t.getName());
        System.out.println(t.getThreadGroup());
        System.out.println(t.getPriority());

        System.out.println();

        Thread t1=new Thread();
        System.out.println(t1.getName());
        System.out.println(t1.getThreadGroup());
        System.out.println(t1.getPriority());
   }
}