
package hotelreservation;
import java.util.Scanner;

public class Customer {
    
    private Scanner scan = new Scanner(System.in);
    private Room r = new Room();
    private String CustomerName;
    private int PhoneNo;
    
    public void setData(){
        System.out.println("Enter your name");
        CustomerName = scan.nextLine();
        System.out.println("Enter your phone number");
        PhoneNo = scan.nextInt();
        
    }
    
    public void getData(){
        System.out.println("Reservation successfull");
        System.out.println("Name : " + CustomerName);
        System.out.println("Phone number : " + PhoneNo);
        System.out.println("Room number : " + r.getRoom());
    }
}
