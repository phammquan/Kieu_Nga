package Polygon;

public class Circle extends Shape {
   private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        double Area = 3.14 * radius * radius;
        return Area;
    }

    @Override
    double getPerimeter() {
        double Perimeter = 3.14 * radius;
        return Perimeter;
    }
    @Override
    public String toString() {
        String name = "Hình tròn";
        return name;
    }
}
