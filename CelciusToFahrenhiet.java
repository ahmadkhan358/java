import java.util.Scanner;

public class CelciusToFahrenhiet{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter temprature in Celcius : ");

        float tempc = scan.nextFloat();

        float tempf = 32+((9/5)*tempc);

        System.out.println("Temprature in fahrenhiet : " + tempf + " degree fahrenhiet");
    }
}