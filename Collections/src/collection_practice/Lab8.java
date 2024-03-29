package collection_practice;
// Comparator interface in collections
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee1 {

    private String name;
    private int age;
    private int salary;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee1(String name,int age,int salary){
         this.name=name;
         this.age=age;
         this.salary=salary;
     }

     @Override
     public String toString() {
        return name+" "+age+" "+salary+" ";
    }

}

class Alpha implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Employee1 e1=(Employee1)o1;
        Employee1 e2=(Employee1)o2;
        return e1.getAge()-e2.getAge();
    }
}

class Beta implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
      Employee1 e1=(Employee1)o1;
      Employee1 e2=(Employee1)o2;
      return e1.getSalary()-e2.getSalary();
    }
}

public class Lab8 {
    public static void main(String[] args) {

        Alpha a=new Alpha();
        Beta b=new Beta();

        Employee1 e1=new Employee1("Arun",26,20000);
        Employee1 e2=new Employee1("Bob",24,30000);
        Employee1 e3=new Employee1("John",23,25000);
        Employee1 e4=new Employee1("Sachin",28,50000);

        ArrayList al=new ArrayList();
        al.add(e1);
        al.add(e2);
        al.add(e3);
        al.add(e4);

        System.out.println(al);

        Collections.sort(al,a);
        System.out.println("Sorting on age:"+al);

        Collections.sort(al,b);
        System.out.println("Sorting on salary:"+ al);

    }
}
