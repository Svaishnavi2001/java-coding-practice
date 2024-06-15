package com.Interfce;

interface  Calculator{
  public void add();
  public void sub();
}
class MyCalculator implements  Calculator{

    public void add(){
         int a=20;
         int b=10;
         System.out.println(a+b);
     }

    public void sub(){
        int a=20;
        int b=10;
         System.out.println(a-b);
     }
}
class MyCalculator1 implements Calculator{

   public  void add(){
        System.out.println("enter num 1");
        int a=10;
        System.out.println("enter num 2");
        int b=10;
        int c=a+b;
       System.out.println(c);
    }
   public  void sub(){
        System.out.println("enter num 1");
        int a=10;
        System.out.println("enter num 2");
        int b=10;
        int c=a-b;
        System.out.println(c);
    }
}
public class Demo {
    public static void main(String[] args) {
        MyCalculator mc=new MyCalculator();
        MyCalculator1 mc1=new MyCalculator1();

        mc.add();
        mc.sub();

        mc1.add();
        mc1.sub();



    }
}
