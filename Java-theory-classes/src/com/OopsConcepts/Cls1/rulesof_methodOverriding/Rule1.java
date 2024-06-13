package com.OopsConcepts.Cls1.rulesof_methodOverriding;
// Same access modifiers
class Parent{

   public void  fun(){
        System.out.println("Hi");
    }
}
class Child extends  Parent{
     public void fun(){
         System.out.println("Hello");
     }
}
public class Rule1 {
    public static void main(String[] args) {

        Parent p=new Parent();
        p.fun();

        Child c=new Child();
        c.fun();;
    }
}
