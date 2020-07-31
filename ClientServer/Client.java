import java.io.DataOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
       try{
           Socket s = new Socket("localhost", 9999);
           DataOutputStream dout = new DataOutputStream(s.getOutputStream());
           dout.writeUTF("Hi");
           dout.flush();
           dout.close();
           s.close();
       }
       catch(Exception e){
           e.printStackTrace();
       }
    }
}
