package com.constructors;

 class Book {

     // instance variables
     int id;
     String author_name;
     String lang;
     float price;

     // parameterized constructor
     public Book(int id, String author_name, String lang, float price) {
         this.id = id;
         this.author_name = author_name;
         this.lang = lang;
         this.price = price;
     }
     // getters
     public int getId() {
         return id;
     }

     public String getAuthor_name() {
         return author_name;
     }

     public String getLang() {
         return lang;
     }

     public float getPrice() {
         return price;
     }
 }
public class Demo1 {
    public static void main(String[] args) {
        Book b=new Book(1, "Rajavarma","Hindi",250.5f);
        System.out.println(b.getId()+" "+b.getAuthor_name()+" "+b.getLang()+" "+b.getPrice());
    }
}