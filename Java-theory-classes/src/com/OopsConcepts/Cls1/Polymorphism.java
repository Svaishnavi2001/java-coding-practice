package com.OopsConcepts.Cls1;
// loose coupling in polymorphism

class Plane{
    void fun(){
        System.out.println("Plane flies");
    }
    void fun1(){
        System.out.println("Plane carries humans and goods ");
    }
}
class CargoPlane extends Plane{

    @Override
    void fun1(){
        System.out.println("CargoPlane carries cargo ");
    }
    void fun2(){
        System.out.println("CargoPlane flies at low height");
    }
}
class PassengerPlane extends Plane{

    @Override
    void fun1(){
        System.out.println("PassengerPlane carries only passengers");
    }
    void fun2(){
        System.out.println("PassengerPlane flies at medium height");
    }
}
class FighterPlane extends Plane{

    @Override
    void fun1(){
        System.out.println("fighterPlane carries only weapons");
    }
    void fun2(){
        System.out.println("PassengerPlane flies at high heights");
    }
}
class Polymorphism{

    public static void main(String[] args) {

        CargoPlane c=new CargoPlane();
        PassengerPlane p=new PassengerPlane();
        FighterPlane f=new FighterPlane();

        Plane ref;
        ref=c;
        ref.fun();
        ref.fun1();


        ref=p;
        ref.fun();
        ref.fun1();


        ref=f;
        ref.fun();
        ref.fun1();


    }
}