package interview.problems;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problem5
{
    public static void main(String[] args) {

        HashMap<Integer,Employee> employeeMap=new HashMap<>();
        employeeMap.put(1,new Employee(1,"Alice Smith", "HR", "Manager", 75000, "alice.smith@example.com"));
        employeeMap.put(2,new Employee(2, "Bob Johnson", "IT", "Developer", 85000, "bob.johnson@example.com"));
        employeeMap.put(3,new Employee(3, "Charlie Brown", "Finance", "Analyst", 65000, "charlie.brown@example.com" ));
        employeeMap.put(4,new Employee(4,"Diana Prince", "Marketing", "Coordinator", 60000, "diana.prince@example.com" ));
        employeeMap.put(5,new Employee(5, "Evan Davis", "Sales", "Salesperson", 70000, "evan.davis@example.com"));
        employeeMap.put(6,new Employee(6, "Fiona Green", "IT", "Support", 55000, "fiona.green@example.com"));

        System.out.println("Using for-each loop over entry set:");
        for(Map.Entry<Integer,Employee> entry : employeeMap.entrySet()){
            System.out.println("key:"+ entry.getKey()+", value:"+entry.getValue());
        }

        System.out.println("\nUsing for-each loop over key set:");
        for(Integer key: employeeMap.keySet()){
            System.out.println("key:"+ key+", value:"+employeeMap.get(key));
        }

        System.out.println("\nUsing for-each loop over values:");
        for(Employee employee: employeeMap.values()){
            System.out.println(employee);
        }

        System.out.println("\nUsing Iterator over entry set:");
        Iterator<Map.Entry<Integer,Employee>> iterator=employeeMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer,Employee> entry=iterator.next();
            System.out.println("key:"+ entry.getKey()+", values:"+entry.getValue());
        }

        System.out.println("\nUsing forEach method:");
        employeeMap.forEach((key,employee)-> System.out.println("key:"+ key+ ", value:"+ employee));



        }
}

