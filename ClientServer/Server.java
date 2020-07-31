import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try{
            ServerSocket ss = new ServerSocket(9999);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = din.readUTF();
            System.out.println(str);
            ss.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
