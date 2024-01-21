package com.OopsConcepts.Cls1;
// Method-overloading concept
class Animal{
       void breathe(){
              System.out.println("Animal breathes");
       }
       void eats(){
              System.out.println("Animal eats flesh");
       }
}
class Tiger extends Animal{

       void breathe(){
              System.out.println("Animal breathes");
       }
       void eats(){
              System.out.println("Tiger eats animals");
       }
       void sleeps(){
              System.out.println("Tiger sleeps 10hrs a day");
       }
}
class Deer extends Animal{

       void breathe(){
              System.out.println("Animal breathes");
       }
       void eats(){
              System.out.println("Deer eats plants");
       }
       void sleeps(){
              System.out.println("Deer sleeps 8hrs a day");
       }
}
class Monkey extends Animal{

       void breathe(){
              System.out.println("Animal breathes");
       }
       void eats(){
              System.out.println("Monkey eats banana");
       }
       void sleeps(){
              System.out.println("Monkey sleeps 6hrs a day");
       }
}
public class Demo {
       public static void main(String[] args) {
              Tiger t=new Tiger();
              Deer d=new Deer();
              Monkey m=new Monkey();

              t.breathe();
              t.eats();
              t.sleeps();
              System.out.println("---------------");

              d.breathe();
              d.eats();
              d.sleeps();
              System.out.println("----------------");

              m.breathe();
              m.eats();
              m.sleeps();
              System.out.println("----------------");
       }
}
