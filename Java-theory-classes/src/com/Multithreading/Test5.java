package com.Multithreading;
// Multithreading with an exception

class Test implements Runnable{

    @Override
    public void run(){
        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("DIV")){
            dividing();
        }
        else if(name.equals("CHAR")){
            printChar();
        }
        else{
            printNum();
        }
    }
    public void dividing(){

        System.out.println("Dividing started");
        int c=100/0;
        System.out.println(c);
        System.out.println("Dividing completed");
    }
    public void printChar() {
        System.out.println("Printing of characters started");
        for (int i = 65; i <= 69; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
        public void printNum () {

            System.out.println("Printing of numbers started");
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
public class Test5 {
    public static void main(String[] args) {

        Test t=new Test();

        Thread t1=new Thread(t);
        Thread t2=new Thread(t);
        Thread t3=new Thread(t);

        t1.setName("DIV");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();

    }
}
