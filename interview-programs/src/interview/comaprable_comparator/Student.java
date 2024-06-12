package interview.comaprable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {

     private String name;
     private int id;
     private int age;

     public Student(String name, int id, int age) {
         this.name=name;
         this.id=id;
         this.age=age;
     }
     public String getName() {
         return name;
     }
     public int getId() {
         return id;
     }
     public int getAge() {
         return age;
     }

    @Override
    public String toString() {
        return name+" "+id+" "+age;
    }

    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.age, other.getAge());
    }
}

class Main{
    public static void main(String[] args) {

        List<Student> students=new ArrayList<>();

        students.add(new Student("Ram",1, 23));
        students.add(new Student("Sham", 2, 13));
        students.add(new Student("Raj", 3, 14));

        Collections.sort(students);


        for(Student s: students){
            System.out.println(s);
        }
    }
}

