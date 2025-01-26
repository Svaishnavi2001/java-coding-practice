package collection_basic_concepts;

public class Employee1 {

    private int id;
    private String name;
    private String department;
    private String position;
    private double salary;
    private String email;

    public Employee1(int id, String name, String department, String position,double salary,String email){
        this.id=id;
        this.name=name;
        this.department=department;
        this.position=position;
        this.salary=salary;
        this.email=email;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public double getSalary(){
        return salary;
    }
    public String getEmail(){
        return email;
    }

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", email='" + email + '\'' +
                '}';

    }

}
