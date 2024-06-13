package com.OopsConcepts.Cls1;

class Customer{
    private int cId;
    private  String cName;
    private  long cNum;

    public Customer(int cId, String cName, long cNum) {
        this.cId = cId;
        this.cName = cName;
        this.cNum = cNum;
    }

    public int getcId() {
        return cId;
    }

    public String getcName() {
        return cName;
    }

    public long getcNum() {
        return cNum;
    }
    @Override
    public String toString() {
        return "Customer{" +
                "cId=" + cId +
                ", cName='" + cName + '\'' +
                ", cNum=" + cNum +
                '}';
    }
}

public class Encapsulation {
    public static void main(String[] args) {

        Customer c=new Customer(1,"Ram", 9591497085l);
        System.out.println(c.getcId());
        System.out.println(c.getcName());
        System.out.println(c.getcNum());

    }
}
