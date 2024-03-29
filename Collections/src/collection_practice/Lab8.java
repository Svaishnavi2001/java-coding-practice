package collection_practice;

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

    public void setSalary(int salary) {
        this.salary = salary;
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
        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        return e1.getAge()-e2.getAge();

    }
}

public class Lab8 {
    public static void main(String[] args) {

        Alpha a=new Alpha();

        Employee1 e1=new Employee();
        Employee1 e2=new Employee();
        Employee1 e3=new Employee();
        Employee1 e4=new Employee();

        ArrayList al=new ArrayList();
        al.add(e1);
        al.add(e2);
        al.add(e4);
        al.add(e1);

        System.out.println(al);
        Collections.sort(al,a);
        System.out.println(al);

    }
}
