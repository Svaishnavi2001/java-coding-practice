package com.OopsConcepts.Cls1;
// Method Hiding concept

class Parent {
    static void display() {
        System.out.println("Hi");
    }
}
class Child extends Parent {
    static void display(){
        System.out.println("Hello");
    }
}
public class MethodOverridingOfStaticMethods {
    public static void main(String[] args) {
        Child.display();
        Parent.display();
    }
}
