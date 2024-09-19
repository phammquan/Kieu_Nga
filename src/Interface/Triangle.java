package Interface;

import Interface.Polygon;

public class Triangle implements Polygon {
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    private double base;
    private double height;

    @Override
    public double area() {
        double area = base*height*0.5;
        return area;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
