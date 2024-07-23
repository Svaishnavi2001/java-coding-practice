package com.constructors;

class Emp {

    // instance variables
    int emp_id;
    String emp_name;
    long emp_phoneNo;
    String emp_email;
    String emp_role;

    //2 parameter constructor
    public Emp(int emp_id,String emp_name ){
        this.emp_id=emp_id;
        this.emp_name=emp_name;
        System.out.println("emp_id:"+" "+emp_id+"\n"+"emp_name:"+" "+emp_name);
    }
    // 2 parameter constructor
    public Emp(long emp_phoneNo,String emp_email){
        this(1,"Ram");
        this.emp_phoneNo=emp_phoneNo;
        this.emp_email=emp_email;
        System.out.println("emp_phoneNo:"+" "+emp_phoneNo+"\n"+"emp_email:"+" "+emp_email);
    }
    // 1 parameter constructor
    public Emp(String emp_role){
        this(9591497084l,"emp@gmail.com");
        this.emp_role=emp_role;
        System.out.println("emp_role:"+" "+emp_role);
    }
}

public class ConstructorChaining{
    public static void main(String[] args) {

        Emp e=new Emp("Sr.Software eng");
    }
}