package com.Multithreading;
import java.util.Scanner;
// Multithreading with 1 run() method

class Demo implements Runnable{

    @Override
    public void run(){

        Thread t=Thread.currentThread();
        String name=t.getName();
        if(name.equals("BANK")){
            banking();
        }
        else if(name.equals("CHAR")){
            printChar();
        }
        else{
            printNum();
        }
    }
    public void banking(){
        System.out.println("Banking started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int pin = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking completed");
    }
    public void printChar(){

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
    public void printNum(){

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
public class Test4 {
    public static void main(String[] args) {

        Demo d=new Demo();

        Thread t1=new Thread(d);
        Thread t2=new Thread(d);
        Thread t3=new Thread(d);

        t1.setName("BANK");
        t2.setName("CHAR");
        t3.setName("NUM");

        t1.start();
        t2.start();
        t3.start();


    }
}
