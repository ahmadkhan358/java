import java.io.*;
import java.util.Scanner;
public class FileHandlingExample1{
   public void createFile(String filename){
       try{
           File obj = new File(filename);
           if(obj.createNewFile()){
               System.out.println("New file created");
           }
           else{System.out.println("File already exists");}
       }
       catch(IOException e){
           System.out.println("An error occurred");
           e.printStackTrace();
       }
   }

   // READ FROM A FILE
   public void readFile(String filename){
       try{
           File newobj = new File(filename);
           Scanner obj = new Scanner(newobj);
           while(obj.hasNextLine()){
               String str = obj.nextLine();
               System.out.println(str);
           }
           obj.close();
       }
       catch(FileNotFoundException e){
           System.out.println("An error occurred");
           e.printStackTrace();
       }
   }

   // WRITE TO A FILE
   public void writeFile(String filename, String text){
       try{
           FileWriter newobj = new FileWriter(filename);
           newobj.write(text);
           newobj.close();
           System.out.println("Successfully wrote to the file");
       }
       catch(IOException e){
           System.out.println("An error occurred");
           e.printStackTrace();
       }
   }

   // APPEND INTO A FILE
    public void appendFile(String filename, String text){
        try{
            FileWriter newobj = new FileWriter(filename, true);
            newobj.write(text);
            newobj.close();
            System.out.println("Successfully wrote to the file");
        }
        catch(IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }


    // SEARCH IN A FILE
    public void searchFile(String filename, String searchText){
       StringBuffer buffer = new StringBuffer();
        try{
            File newobj = new File(filename);
            Scanner obj = new Scanner(newobj);
            while(obj.hasNextLine()){
                String str = obj.nextLine();
                buffer.append(str);
            }
            obj.close();
        }
        catch(FileNotFoundException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        if(buffer.toString().contains(searchText)){
            System.out.println("The text is present in the file");
        }
    }

    public static void main(String[] args) {
        FileHandlingExample1 myfile = new FileHandlingExample1();
        String filename = "textfile.txt";
        Scanner scan = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("--------SELECT OPTION---------");
        System.out.println("--------1: READ FILE----------");
        System.out.println("--------2: WRITE FILE---------");
        System.out.println("--------3: APPEND FILE--------");
        System.out.println("--------4: SEARCH FILE--------");

        int choice = scan.nextInt();

        switch(choice){
            case 1:
                myfile.readFile(filename);
                break;
            case 2:
                myfile.writeFile(filename, "some random text");
                break;
            case 3:
                myfile.appendFile(filename, "some appendable text");
                break;
            case 4:
                myfile.searchFile(filename, "some");
                break;
            default:
                System.out.println("Wrong input");

        }
    }
}