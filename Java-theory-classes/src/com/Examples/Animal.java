package com.Examples;

 class Animal {
     void breathe(){
        System.out.println("Animal breathe");
    }
    void eats(){
        System.out.println("Animal eats meat and herbs");
    }
}
class Deer extends  Animal{
     void eats(){
         System.out.println("Deer eats only herbs");
     }
     void sleeps(){
         System.out.println("Deer sleeps 5 hours a day ");
     }
 }
 class Tiger extends Animal{
     void eats(){
         System.out.println("Tiger eats only meat");
     }
     void sleeps(){
         System.out.println("Tiger sleeps 8 hours a day ");
     }
 }
 class Monkey extends Animal{
     void eats(){
         System.out.println("Monkey eat bananas");
     }
     void sleeps(){
         System.out.println("Monkey sleeps less time ");
     }
 }
class Demo {
    public static void main(String[] args) {
        Deer d=new Deer();
        d.breathe();
        d.eats();
        d.sleeps();
        System.out.println("----------");

        Tiger t=new Tiger();
        d.breathe();
        t.eats();
        t.sleeps();
        System.out.println("----------");

        Monkey m=new Monkey();
        d.breathe();
        m.eats();
        m.sleeps();

    }
 }

