package com.ExceptionHandling;

public class Demo3 {

    public static void main(String[] args) {

        for (int i = 97; i <= 105; i++) {
            System.out.println((char) i);

            try {
                Thread.sleep(3000);
            }
            catch (Exception e) {
                System.out.println("Handled");
            }
        }

    }
}