package com.OopsConcepts.Cls2;
// Abstraction with code flexibility

abstract class Bird1{

    abstract void fly();
    abstract void eat();
}
abstract  class Eagle1 extends Bird1{
    @Override
    void fly() {
        System.out.println("Eagle flies at higher heights");
    }
}
abstract class Sparrow1 extends Bird1{
    @Override
    void fly() {
        System.out.println("Sparrow flies at medium heights");
    }
}
class SerpentEagle1 extends Eagle1{
    @Override
    void eat(){
        System.out.println("SerpentEagle eats snakes");
    }
}
class OceanEagle1 extends Eagle1{
    @Override
    void eat() {
        System.out.println("OceanEagle eats fishes");
    }
}
class VegSparrow1 extends Sparrow1{
    @Override
    void eat() {
        System.out.println("VegSparrow eats grains ");
    }
}
class NonVegSparrow1 extends Sparrow1{
    @Override
    void eat() {
        System.out.println("NonVegSparrow eats insects");
    }
}
class BirdFamily{
    void sky(Bird1 b){
        b.fly();
        b.eat();
    }
}
public class AbstractionWithCodeFlexibility {
    public static void main(String[] args) {
        SerpentEagle1 se = new SerpentEagle1();
        OceanEagle1 oe = new OceanEagle1();
        VegSparrow1 ve = new VegSparrow1();
        NonVegSparrow1 nve = new NonVegSparrow1();

        BirdFamily b=new BirdFamily();
        b.sky(se);
        b.sky(oe);
        b.sky(ve);
        b.sky(nve);
    }
}