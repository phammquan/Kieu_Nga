package Polygon;

import Polygon.Circle;
import Polygon.Shape;

public class TestAllShape {
    public static void main(String[] args) {
        Shape s1 = new Circle("RED", true, 5.5);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        System.out.println(((Circle) s1).getRadius());
        Circle c1 = (Circle) s1;
        System.out.println("\n");
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
    }
}
