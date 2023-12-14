package com.constructors;

public class Order {

    int orderId;
    int item;
    float amount;
    float charges;
    String address;

    // Parameterized constr
    public Order(int orderId, int item, String address, float amount, float charges){
       this();
}
   // Zero parameter constr
    public Order() {
        this.orderId = orderId;
        this.item = item;
        this.amount = amount;
        this.charges = charges;
        this.address = address;
    }
    // Setters and Getters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getCharges() {
        return charges;
    }

    public void setCharges(int charges){
        this.charges=charges;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address=address;
    }
}
public class Demo{
    public static void main(String[] args) {
        Order o=new Order();
    }

}
