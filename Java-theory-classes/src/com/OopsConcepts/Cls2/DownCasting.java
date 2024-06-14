package com.OopsConcepts.Cls2;
// DownCasting in Polymorphism

class Plane1{
    void fly(){
        System.out.println("Plane flies");
    }
}
class CargoPlane1 extends Plane1{
    @Override
    void fly(){
        System.out.println("CargoPlane flies");
    }
    void carryCargo(){
        System.out.println("CargoPlane carries cargo");
    }
}
class PassengerPlane1 extends Plane1{
    @Override
    void fly(){
        System.out.println("PassengerPlane flies");
    }
    void carryPeople(){
        System.out.println("PassengerPlane carries people");
    }
}
class FighterPlane1 extends Plane1 {
    @Override
    void fly() {
        System.out.println("FighterPlane flies");
    }
    void carryWeapons() {
        System.out.println("FighterPlane carries weapons");
    }
}
public class DownCasting {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        PassengerPlane1 pp=new PassengerPlane1();
        FighterPlane1 fp=new FighterPlane1();

        Plane1 ref;
        ref=cp;
        ref.fly();;
        ((CargoPlane1)ref).carryCargo();

        ref=pp;
        ref.fly();
        ((PassengerPlane1)ref).carryPeople();

        ref=fp;
        ref.fly();
        ((FighterPlane1)ref).carryWeapons();
    }
}
