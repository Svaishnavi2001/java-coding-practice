package interview.problems;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Problem4
{
    public static void main(String[] args) {

        ArrayList<Employee> employees=new ArrayList<>();

        employees.add(new Employee(1, "Alice Smith", "HR", "Manager", 75000, "alice.smith@example.com"));
        employees.add(new Employee( 2, "Bob Johnson", "IT", "Developer", 85000, "bob.johnson@example.com"));
        employees.add(new Employee(3, "Charlie Brown", "Finance", "Analyst", 65000, "charlie.brown@example.com"));
        employees.add(new Employee(4, "Diana Prince", "Marketing", "Coordinator", 60000, "diana.prince@example.com"));
        employees.add(new Employee(5, "Evan Davis", "Sales", "Salesperson", 70000, "evan.davis@example.com"));
        employees.add(new Employee(6, "Fiona Green", "IT", "Support", 55000, "fiona.green@example.com"));

        for(int i=0;i<employees.size();i++){
            System.out.println(employees.get(i));
        }

        System.out.println("Using for loop:");
        for(Employee  employee: employees){
            System.out.println(employee);
        }

        System.out.println("\nUsing for-each loop:");
        Iterator<Employee> iterator=employees.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("\nUsing iterator:");
        ListIterator<Employee> listIterator=employees.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        System.out.println("\nUsing listIterator:");
        while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        System.out.println("\nUsing forEach method:");
        employees.forEach(employee -> System.out.println(employee));

        System.out.println("\nUsing streams:");
        employees.stream().forEach(employee -> System.out.println(employee));

        System.out.println("\nUsing parallel streams::");
        employees.parallelStream().forEach(employee -> System.out.println(employee));


    }
}
