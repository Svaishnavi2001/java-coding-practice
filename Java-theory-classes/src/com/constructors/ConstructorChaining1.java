package com.constructors;

class Parent{

    public Parent(){
        System.out.println(" default constructor");
    }

    public Parent(int x){
        this();
        System.out.println(" 1 arg constructor");
    }

    public Parent(int x, int y){
        this(3);
        System.out.println(" 2 arg constructor");
    }
}
public class ConstructorChaining1{
    public static void main(String[] args) {

        Parent p=new Parent(10,100);
    }
}
