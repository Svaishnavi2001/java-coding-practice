package com.constructors;

public class ParameterPractice {

    int x;
    int y;
    int z;

    // Two argument constructor
    public ParameterPractice(int x, int y){
        this.x=x;
        this.y=y;
    }

    // Single arguement constructor.
    public ParameterPractice(int zeeee){
        this.z=zeeee;
    }

    //This is a no argument constructor.
    public ParameterPractice(){

    }

    public int addtion(int a, int b){
        return a+b;
    }

    public int addtion(int a, int b, int c){
        return a+b+c;
    }

    public int addtion(int a){
        return a;
    }

    @Override
    public String toString() {
        return "shrikar{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
