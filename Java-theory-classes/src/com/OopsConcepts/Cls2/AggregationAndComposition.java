package com.OopsConcepts.Cls2;
// Aggregation and Composition

class Charger{
     private String brand;
     private float voltage;

     public Charger(String brand,float voltage){
         this.brand=brand;
         this.voltage=voltage;
     }
     public String getBrand(){
         return brand;
     }
     public float getVoltage(){
         return voltage;
     }
}
class Os{
        private String name;
        private int size;

        public Os(String name,int size){
            this.name=name;
            this.size=size;
        }
        public String getName(){
          return name;
        }
        public int getSize(){
            return size;
        }
}
class Mobile{
    Os o=new Os("ANDRIOD",3);
    void hasA(Charger c){
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
public class AggregationAndComposition {
    public static void main(String[] args) {
        Mobile m=new Mobile();
        Charger c=new Charger("SAMSUNG",12.0f);
        System.out.println(m.o.getName());
        System.out.println(m.o.getSize());

        m.hasA(c);

        m=null;
        System.out.println(c.getBrand());
        System.out.println(c.getVoltage());
    }
}
