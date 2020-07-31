public class Rectangle extends GeometricObject {

    private int length;
    private int width;

    public Rectangle(int l, int w){
        length = l;
        width = w;
    }

    @Override
    public double calcArea() {
        return length*width;
    }

    @Override
    public String toString() {
        return new java.awt.Rectangle(width, length).toString();
    }
}
