package com.Multithreading;
import java.util.Scanner;

// Multithreading (Extending a thread class)
class Demo1 extends Thread{
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
class Demo2 extends Thread{
    @Override
    public void run(){
        System.out.println("Printing of characters started");
        for (int i = 65; i <= 69; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
        System.out.println("Printing of characters completed");
    }
}
class Demo3 extends Thread{
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
public class Test2 {

    public static void main(String[] args) {
         Demo1 d1=new Demo1();
         Demo2 d2=new Demo2();
         Demo3 d3=new Demo3();

         d1.start();
         d2.start();
         d3.start();

    }
}
