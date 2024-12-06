package interview.important_ques;

import java.util.Scanner;

class Circle{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public double area(){
        return Math.PI*radius*radius;
    }
}
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius=sc.nextDouble();

        Circle circle = new Circle(radius);

        double area= circle.area();
        System.out.println(area);

    }
}
