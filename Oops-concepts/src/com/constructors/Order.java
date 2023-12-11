package com.constructors;

public class Order {
    int orderId;
    int item;
    float amount;
    float charges;
    String address;

    public Order(int orderId,int item,String address,float amount,float charges){
        this.orderId=orderId;
        this.item=item;
        this.amount=amount;
        this.charges=charges;
        this.address=address;
    }
    public int orderId(){
       return orderId;
    }
    public void setOrderId(int orderId){
        this.orderId=orderId;
    }
    public int item(){
        return item;
    }
    public void setItem(int item){
        this.item=item;
    }
    public float amount(){
        return amount;
    }
    public void setAmount(float amount){
        this.amount=amount;
    }
    public float charges(){
        return chargee
    }
    public String address(){
        return address;
    }
    public void setAddress(String address){

    }


}
