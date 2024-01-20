package com.Oopsconcept.Practice;
// Polymorphism (Loose coupling)

class Plane1{
    void fly(){
        System.out.println("Plane flies");
    }
}
class CargoPlane1 extends Plane1{
    void fly(){
        System.out.println("CargoPlane flies");
    }
}
class PassengerPlane1 extends Plane1{
    void fly(){
        System.out.println("PassengerPlane flies");
    }
}
class FighterPlane1 extends Plane1{
    void fly(){
        System.out.println("FighterPlane flies");
    }
}
public class Demo4 {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        PassengerPlane1 pp=new PassengerPlane1();
        FighterPlane1 fp=new FighterPlane1();

        Plane1 ref;
        ref=cp;
        ref.fly();

        ref=pp;
        ref.fly();

        ref=fp;
        ref.fly();
    }
}
