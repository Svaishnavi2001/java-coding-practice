package com.OopsConcepts.Cls2;

abstract class Breed {

   abstract void colour();
   abstract void cost();
   abstract void sweetness();

}
class Fruit extends  Breed{
     void colour(){
         System.out.println("Red");
     }
    void cost(){
        System.out.println("200");
    }
    void sweetness(){
        System.out.println("Very Sweet");
    }
}
public class AbstractionDemo {
    public static void main(String[] args) {

        Fruit f=new Fruit();
        f.colour();
        f.cost();
        f.sweetness();
    }
}
