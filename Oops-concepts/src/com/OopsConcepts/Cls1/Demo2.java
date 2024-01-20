package com.OopsConcepts.Cls1;
// Method Hiding concept

class Parent {
    static void disp() {
        System.out.println("Hi");
    }
}
class Child extends Parent {
    static void disp(){
        System.out.println("Hello");
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Child.disp();
    }
}
