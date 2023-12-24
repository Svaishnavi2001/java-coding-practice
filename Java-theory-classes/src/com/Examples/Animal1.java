package com.Examples;

public class Animal1 {
    void breathe(){
        System.out.println("Animal breaths");
    }
    void eats(){
        System.out.println("Animal eats");
    }
}
class Deer1 extends Animal1{
    void breathe(){
        System.out.println("Deer breaths fast");
    }
    void eats(){
        System.out.println("Deer eats plants");
    }
}
class Tiger1 extends Animal1{
    void breathe(){
        System.out.println("Tiger breaths slow ");
    }
    void eats(){
        System.out.println("Tiger eats only meat");
    }
}
class Monkey1 extends Animal1{
    void breathe(){
        System.out.println("Monkey breaths very fast");
    }
    void eats(){
        System.out.println("Monkey eats Bananas");
    }
}
class Demo2 {
    public static void main(String[] args) {
         Deer d=new Deer();
         d.breathe();
         d.eats();
        System.out.println("---------------");
         Tiger t=new Tiger();
         t.breathe();
         t.eats();
        System.out.println("----------------");
         Monkey m=new Monkey();
         m.breathe();
         m.eats();
        System.out.println("----------------");
    }
}