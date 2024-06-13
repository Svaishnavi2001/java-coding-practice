package com.OopsConcepts.Cls1.rulesof_methodOverriding;
// Same return types

class Parent1{
     public int fun(){
         System.out.println("Hi");
         return 1;
     }
}
class Child1 extends  Parent1{
    public int fun(){
        System.out.println("Hello");
        return 1;
    }
}

public class Rule2 {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.fun();
    }
}
