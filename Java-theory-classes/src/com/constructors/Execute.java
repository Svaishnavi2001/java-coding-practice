package com.constructors;

public class Execute {
    public static void main(String[] args) {

        ParameterPractice p = new ParameterPractice();
        p.addtion(99);
        int res = p.addtion(99,66);
        System.out.println(res);

        ParameterPractice p1= new ParameterPractice(77);
        System.out.println(p1);

        ParameterPractice p2= new ParameterPractice(77, 1);
        System.out.println(p2);
        System.out.println(p2.x);

    }
}


