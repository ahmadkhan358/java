import java.util.Scanner;

interface Area{
    public void get_values();
    public void calc_area();
    public void disp_area();
}

class Circle implements Area{
    private float a, r, pi;

    public Circle(){
        r = 0.0f;
        a = 0.0f;
        pi = 3.14f;
    }

    public void get_values(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the value of radius");

        r = obj.nextFloat();
    }

    public void calc_area(){
        a = 2* pi* r;
    }

    public void disp_area(){
        System.out.println("Area of circle is : " + a);
    }
}

class Square implements Area{
    private float l, w, a;

    public Square(){
        l = 0.0f;
        w = 0.0f;
        a = 0.0f;
    }

    public void get_values(){
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter the value of length");
        l = obj.nextFloat();
        
        System.out.println("Enter the value of width");
        w = obj.nextFloat();
    }

    public void calc_area(){
        if(l != w){
            System.out.println("Since it is a square, so length and width must be equal");
        }
        else{
            a = l* w;
        }
    }

    public void disp_area(){
        if(a == 0){
            System.out.println("Cannot print the area, because it is not calculated");
        }
        else{
            System.out.println("Area of square is : " + a);
        }
    }
}

public class Interface{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        char ch;

        System.out.println("Press 'c' to calculate the area of circle,  press 's' to calculate the area of square");
        ch = obj.next().charAt(0);

        switch(ch){
            case 'c':
                Circle cir = new Circle();
                cir.get_values();
                cir.calc_area();
                cir.disp_area();
                break;

            case 's':    
                Square sq = new Square();
                sq.get_values();
                sq.calc_area();
                sq.disp_area();
                break;
            
            default :
                System.out.println("Wrong input");
                break;
        }
    }
}