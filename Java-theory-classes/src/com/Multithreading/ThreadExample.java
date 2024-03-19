package com.Multithreading;

public class ThreadExample extends Thread{

    public void run() {
        System.out.println("Thread running: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        ThreadExample thread1 = new ThreadExample();
        ThreadExample thread2 = new ThreadExample();
        System.out.println("Thread running: " + Thread.currentThread().getName());
        thread1.start();
        thread2.start();
    }
}
