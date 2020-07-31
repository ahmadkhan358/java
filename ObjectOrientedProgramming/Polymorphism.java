abstract class Shape{
    abstract public void calc_area();
    abstract public void display_area();
}

class circle extends Shape{
    private float r;
    public float area;
    final float pi = 3.1416f;

    public circle(float rad){
        r = rad;
    }

    public void calc_area(){
        area = 2* pi * r;
    }

    public void display_area(){
        System.out.println("The area of circle is: " + area);
    }
}

class square extends Shape{
    private float l, w;
    public float area;

    public square(float len, float wid){
        l = len;
        w = wid;
    }

    public void calc_area(){
        if(l != w){
            System.out.println("Length must be equal to width, since it is a square");
        }else{
            area = l* w;
        }
    }

    public void display_area(){
        if(area == 0){
            System.out.println("Area is not calculated");
        }
        System.out.println("The area of square is: " + area);
    }

}

public class Polymorphism{
    public static void main(String[] args){
        Shape cir = new circle(3.4f);
        cir.calc_area();
        cir.display_area();
        Shape sq = new square(2,2);
        sq.calc_area();
        sq.display_area();
    }
}