package com.OopsConcepts.Cls1;

class BankAccount{
     int accNum=1233;
     int pin=1243;

}
class Hacker extends BankAccount{

    void display(){
        System.out.println(accNum);
        System.out.println(pin);
    }
    void changeData(){
        accNum=3455;
        pin=3456;
    }
}
public class Inheritance {
    public static void main(String[] args) {

        Hacker h=new Hacker();
        h.display();
        h.changeData();
        h.display();


    }
}
