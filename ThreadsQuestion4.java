

public class Threads implements Runnable {
    public static void main(String[] args) {
        Thread t = new Thread(new Threads());
        t.start();
        try {
            t.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread ThreadOne = new Thread();
        Thread ThreadTwo = new Thread();
        Thread ThreadThree = new Thread();

    }

    @Override
    public void run() {
        try{
            for(int i=1; i<=5000; i++){
                if(i%2 == 1){
                    if(i%9 == 0){
                        System.out.println(i);
                    }
                }
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
