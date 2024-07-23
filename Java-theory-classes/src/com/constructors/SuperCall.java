package com.constructors;

class  Parent1{
    public Parent1(){
        System.out.println("parent default constructor");
    }
    public Parent1(int x){
        this();
        System.out.println("1 arg constructor");
    }
}
class Child extends Parent1{
    public Child(){
        super(100);
        System.out.println("Child default constructor");
    }
    public Child(int x){
        super();
        System.out.println("1 arg constructor");

    }
}

public class SuperCall {
    public static void main(String[] args) {

        Child c=new Child(10);
    }
}
