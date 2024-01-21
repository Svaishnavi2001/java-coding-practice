package com.OopsConcepts.Cls2;
// Aggregation and composition
class Bike{
    private String brand;
    private float mileage;

    public Bike(String brand,float mileage){
        this.brand=brand;
        this.mileage=mileage;
    }
    public String getBrand(){
        return brand;
    }
    public float getMileage(){
        return mileage;
    }
}
class Book{
    private String name;
    private String author;

    public Book(String name,String author){
        this.name=name;
        this.author=author;
    }
    public String getName(){
        return name;
    }
    public String getAuthor(){
        return author;
    }
}
class Heart{
     private float weight;
     private int  bpm;
     public Heart(float weight,int  bpm){
         this.weight=weight;
         this.bpm=bpm;
     }
     public float getWeight(){
         return weight;
     }
     public float getBpm(){
         return bpm;
     }
}
class Brain{
     private float weight;
     private String colour;
     public Brain(float weight,String colour){
         this.weight=weight;
         this.colour=colour;
     }
     public float getWeight(){
         return weight;
     }
     public String getColour(){
         return colour;
     }
}
class Student{
    Heart h=new Heart(45.0f,35);
    Brain b=new Brain(120,"GREY");
    void hasA(Bike bk){
        System.out.println(bk.getBrand());
        System.out.println(bk.getMileage());
    }
    void hasA(Book b){
        System.out.println(b.getName());
        System.out.println(b.getAuthor());
    }
}
public class Lab4 {
    public static void main(String[] args) {
        Student s=new Student();
        Bike bk=new Bike("FZS",40);
        Book b=new Book("VALMIKI","RAMAYAN");
    }

}
