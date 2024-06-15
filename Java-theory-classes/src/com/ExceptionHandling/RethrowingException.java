package com.ExceptionHandling;

class  Example {

    void fun() throws ArithmeticException {
        int a = 10;
        int b = 0;

        try {
            int c = a / b;
            System.out.println(c);

        }
        catch (Exception e) {
            System.out.println("Handled inside fun()");
            throw e;
        }
    }
}

public class RethrowingException {
    public static void main(String[] args) {

        try {
            Example e = new Example();
            e.fun();
        } catch (Exception e) {
            System.out.println("handled inside main()");
        }
    }
}