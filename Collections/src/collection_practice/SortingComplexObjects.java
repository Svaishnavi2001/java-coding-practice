package collection_practice;
// Sorting complex objects in collections.(comparable Interface)

import java.util.ArrayList;
import java.util.Collections;

class Employee implements Comparable{

    String name;
    int age;
    int salary;
     public Employee(String name,int age,int salary){
         this.name=name;
         this.age=age;
         this.salary=salary;
     }

    @Override
    public String toString() {
        return name+" "+age+" "+salary+" ";
    }

    @Override
    public int compareTo(Object o) {
         Employee ee= (Employee) o;
//        if (this.age == ee.age) {
//            return 0;
//        }
//        else if(this.age>ee.age){
//            return 1;
//        }
//        else{
//            return -1;
//        }
       return this.name.compareTo(ee.name);
    }
}

public class SortingComplexObjects {
    public static void main(String[] args) {
        
        Employee e1=new Employee("Rahul",26, 25000);
        Employee e2=new Employee("Sachin",28,30000);
        Employee e3=new Employee("Sneha",23,20000);

        ArrayList al=new ArrayList();
        al.add(e1);
        al.add(e2);
        al.add(e3);

        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);

    }
}
