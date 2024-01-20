package com.Oopsconcept.Practice;
// Polymorphism (Tight coupling)

class Plane{
    void fly() {
        System.out.println("Plane flies");
    }
}
class CargoPlane extends Plane{
    @Override
    void fly() {
        System.out.println("CargoPlane flies");
    }
}
class PassengerPlane extends Plane{
    @Override
    void fly(){
        System.out.println("PassengerPlane flies");
    }
}
class FighterPlane extends Plane{
    @Override
    void fly(){
        System.out.println("FighterPlane flies");
    }
}
public class Demo3 {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane ();
        PassengerPlane pp=new PassengerPlane();
        FighterPlane fp=new FighterPlane();

        cp.fly();
        pp.fly();
        fp.fly();
    }
}
