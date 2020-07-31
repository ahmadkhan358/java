import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class ArrayList {
    private ArrayList al1 =  new ArrayList();
    private Random rand = new Random();

    public void fillarraylist(){
        for(int i=0; i<10; i++) {
            al1.add(rand.nextInt(50));
        }
    }

    public void displayarraylist(){
        for(int i=0; i<10; i++){
            System.out.println(al1.get(i));
        }
    }

    public void searcharraylist(int number){
        for(int i=0; i<10; i++){
            if((int)al1.get(i) == number){
                System.out.println("Number found at index " + i);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList alq2 = new ArrayList();
        alq2.fillarraylist();
        alq2.displayarraylist();


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to search in arraylist");
        int n = scan.nextInt();

        alq2.searcharraylist(n);
    }
}
