package com.OopsConcepts.Cls2;
// Abstraction with constructor

abstract class Demo{

     Demo(){
          System.out.println("Inside Parent constructor");
     }
}
class Demo1 extends Demo{
     Demo1(){
          System.out.println("Inside child constructor ");
     }
}
public class Lab5 {
     public static void main(String[] args) {
          Demo1 d=new Demo1();
     }
}