package interview.Test;
class Parent{
    static int x=10;
    static int y=20;

    static void fun1(){
        System.out.println("inside parent static method");
    }
}
class Child extends Parent{

    int x=100;
    int y=200;
    /*
     void fun1(){
        System.out.println("inside child static method");
    }*/
    void fun2(){
        System.out.println("inside child class");
    }

}
public class StaticExample {
    public static void main(String[] args) {

        Child c=new Child();
        c.fun2();
        System.out.println(c.x);
        System.out.println(c.y);


    }
}
