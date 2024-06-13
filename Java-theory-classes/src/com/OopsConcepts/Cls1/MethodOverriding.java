package com.OopsConcepts.Cls1;

class Animal1{
    void breathe(){
        System.out.println("Animal breathes");
    }
}
class Tiger1 extends Animal1{
    @Override
    void breathe(){
        System.out.println("Tiger breathes");
    }
}
class Deer1 extends Animal1{
    @Override
    void breathe(){
        System.out.println("Deer breathes");
    }
}
class Monkey1 extends Animal1{
    @Override
    void breathe(){
        System.out.println("Monkey breathes");
    }

}
public class MethodOverriding {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        Deer1 d=new Deer1();
        Monkey1 m=new Monkey1();

      t.breathe();
      d.breathe();
      m.breathe();
    }
}
