package com.OopsConcepts.Cls2;
// Loose coupling in Polymorphism ( for code flexible)
class Plane {
    void fly(){
        System.out.println("Plane flies");
    }
}
class CargoPlane extends Plane{
    @Override
    void fly(){
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
class Airport{

    void permit(Plane ref){
        ref.fly();
    }
}
public class Lab1 {
    public static void main(String[] args) {
        CargoPlane cp=new CargoPlane();
        PassengerPlane pp=new PassengerPlane();
        FighterPlane fp=new FighterPlane();

        Airport a=new Airport();
        a.permit(cp);
        a.permit(pp);
        a.permit(fp);

    }
}
