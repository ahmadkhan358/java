import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.IOException;

class Person implements Serializable{
    String name;

    public Person(String n){
        this.name = n; 
    }

    public String toString(){
        return "Person [name = " + name + "]";
    }
}

public class SerializationExample2{
    public static void main(String[] args){

        Person mike = new Person("Mike");

        // try{
        //     writeToFile(mike);
        // }
        // catch(IOException e){
        //     System.out.println(e.getMessage());
        // }

        try{
            readFile();
        }
        catch(ClassNotFoundException | IOException e){
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFile(Person p) throws IOException{
        FileOutputStream fileOutputStream = new FileOutputStream("File.bin");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        
        objectOutputStream.writeObject(p);
    }

    public static void readFile() throws IOException, ClassNotFoundException{
        FileInputStream fileInputStream = new FileInputStream("File.bin");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Person name = (Person)objectInputStream.readObject();
        System.out.println(name);
    }
}