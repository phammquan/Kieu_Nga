package Interface;

public class TestPolygon {
    public TestPolygon(Triangle a, Rectangle b){
        System.out.println("Do dai canh day va chieu cao cua tam gia la:" + a.getBase() +", " + a.getHeight());
        System.out.println("Dien tich cua tam giac la: " + a.area());
        System.out.println("Do dai chieu rong va chieu dai cua hinh chu nhat la: " + b.getLenght() + ", " + b.getWidth());
        System.out.println("DIen tich cua hinh chu nhat la: " + b.area());
    }
    public static void main(String[] args) {
        Polygon a = new Triangle(5,5);
        Polygon b = new Rectangle(5,5);
        new TestPolygon((Triangle)a,(Rectangle)b);

    }
}
