package interview.important_ques;

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
        Circle circle = new Circle(2.2d);
        double area= circle.area();
        System.out.println(area);

    }
}
