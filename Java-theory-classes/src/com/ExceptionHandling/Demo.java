package com.ExceptionHandling;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no 1");
        int a=sc.nextInt();
        System.out.println("Enter no 2");
        try{
        int b = sc.nextInt();
        int c = a / b;
        System.out.println(c);
        }
        catch (Exception e){
            System.out.println("Give valid input");
        }
    }
}
