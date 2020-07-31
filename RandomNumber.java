import java.util.*;

public class RandomNumber{
    public static void main(String[] args){

        final int MAX_NO = 10;

        Random rand = new Random();
        int randno = rand.nextInt(MAX_NO);

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a number between 1 and 9");
        int no = scan.nextInt();

        if(randno == no){
            System.out.println("Your guess was right");
        }
        else{
            System.out.println("Better luck next time");
        }
    }
}