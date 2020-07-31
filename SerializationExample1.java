
import java.io.*;


public class SerializationExample1 implements Serializable {

    public int a;
    public String b;

    public SerializationExample1(int a, String b){
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {
        SerializationExample1 s = new SerializationExample1(1, "Ahmad");
        String filename = "demo.txt";

        try{
            FileOutputStream fout = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(fout);

            out.writeObject(s);

            out.close();
            fout.close();

            System.out.println("Object has been SerializationExample1d");
        }
        catch(IOException e){
            e.printStackTrace();
        }

        SerializationExample1 s1 = null;

        try{
            FileInputStream fin = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(fin);

            s1 = (SerializationExample1)in.readObject();

            in.close();
            fin.close();

            System.out.println("Object has been deSerializationExample1d");
            System.out.println("Data : " + s1.a + " " + s1.b);
        }
        catch(IOException e){
            e.printStackTrace();
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
