package com.Multithreading;
import java.util.Scanner;
// Multithreading (Implementing an interface Runnable)/ Multithreading with multiple run() methods

class Demo4 implements Runnable{
    @Override
            public void run() {
        System.out.println("Banking started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int pin = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking completed");
    }
}
class Demo5 implements Runnable{
     @Override
    public void run(){
         System.out.println("Printing of characters started");
         for (int i = 65; i <= 69; i++) {
             System.out.println((char) i);
             try {
                 Thread.sleep(3000);
             }
             catch (Exception e) {
                 e.printStackTrace();
             }
         }
         System.out.println("Printing of characters completed");
     }
}
class Demo6 implements Runnable{
    @Override
    public void run(){
        System.out.println("Printing of numbers started");
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("Printing of numbers completed");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Demo4 d4=new Demo4();
        Demo5 d5=new Demo5();
        Demo6 d6=new Demo6();

        Thread t1=new Thread(d4);
        Thread t2=new Thread(d5);
        Thread t3=new Thread(d6);

        t1.start();
        t2.start();
        t3.start();
    }
}
