package com.Oopsconcept.Practice;

class Parent1{
    int i=9;
}
class Child1 extends Parent1{
    int i=99;
    void disp(){
        System.out.println(super.i);
    }
}
public class Demo2 {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.disp();
    }
}
