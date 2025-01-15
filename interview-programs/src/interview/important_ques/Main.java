package interview.important_ques;

abstract class  Demo{

    abstract  void fun1();
    abstract public void fun2();

    public void fun3(){
        System.out.println("Hi");
    }
    private void fun4(){
        System.out.println("Hello");
    }
    static void fun5(){
        System.out.println("How are you");
    }
}
class Demo1 extends Demo{

    public  void fun1(){
        System.out.println("Implementation of fun1 method");
    }
    public  void fun2(){
        System.out.println("Implementation of fun2 method");
    }
    public void fun6(){
        System.out.println("Specialized method");
    }
}
class Demo2 extends  Demo1{

}
public class Main {
    public static void main(String[] args) {

        Demo d = new Demo1();
        d.fun1();
        d.fun2();
        d.fun3();
        ((Demo1) d).fun6();

        Demo d1=new Demo2();
        d1.fun1();
        d1.fun2();
        d1.fun3();
        d1.fun5();
    }
}
