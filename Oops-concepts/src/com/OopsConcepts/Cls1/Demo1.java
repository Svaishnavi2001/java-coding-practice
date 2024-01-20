package com.OopsConcepts.Cls1;
// Method-overloading (for code flexibility)
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
class Forest {
    void permit(Animal1 ref) {
        ref.breathe();
    }
}
public class Demo1 {
    public static void main(String[] args) {
        Tiger1 t=new Tiger1();
        Deer1 d=new Deer1();
        Monkey1 m=new Monkey1();

        Forest f=new Forest();
        f.permit(t);
        f.permit(d);
        f.permit(m);
    }
}
