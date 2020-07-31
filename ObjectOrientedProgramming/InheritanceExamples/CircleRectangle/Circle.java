public class Circle extends GeometricObject {
    private double radius;
    public static final double PI = 3.1415;

    public Circle(double r){
        radius = r;
    }

    @Override
    public double calcArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return new javafx.scene.shape.Circle(radius).toString();
    }
}
