import java.util.ArrayList;
import java.util.Collections;

public class DecimalToBinaryConversion{
    public static void main(String[] args){
        ArrayList<Integer> arrlist = new ArrayList<Integer>();

        int a = 90;
        int b = 2;

        while(true){
            int c = a/b;
            int d = a%b;

            a = c;

            arrlist.add(d);

            if(a<2){
                arrlist.add(1);
                break;
            }

        }

        Collections.reverse(arrlist);

        for(int i: arrlist){
            System.out.print(i);
        }
    }
}