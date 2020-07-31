import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

        List<Integer> fiboNums = fibonacci(10);

        for(int i: fiboNums){
            System.out.print(i + " ");
        }

    }


    public static List<Integer> fibonacci(int range){
        List<Integer> fib = new ArrayList<>();

        fib.add(0);
        fib.add(1);

        for(int i=2; i<=range; i++){
            int newNum =fib.get(i-1) + fib.get(i-2);
            fib.add(newNum);
        }

        return fib;
    }

}
