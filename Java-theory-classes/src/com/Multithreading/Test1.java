package com.Multithreading;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {

        System.out.println("Banking started");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int pin = scan.nextInt();
        System.out.println("Collect your money");
        System.out.println("Banking completed");

        System.out.println("Printing of characters started");
        for (int i = 65; i <= 69; i++) {
            System.out.println((char) i);
            try {
                Thread.sleep(3000);
            } catch (Exception e) {
                //System.out.println("Handled");
                e.printStackTrace();
            }
        }
            System.out.println("Printing of characters completed");

        System.out.println("Printing of numbers started");
        for(int i=1;i<=10;i++){
            System.out.println(i);
            try {
                Thread.sleep(2000);
            }
            catch(Exception e){
               // System.out.println("Handled");
                e.printStackTrace();
            }
        }
        System.out.println("Printing of numbers completed");
    }
}