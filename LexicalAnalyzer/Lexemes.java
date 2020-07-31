import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Lexemes {

    protected List<Object> lex = new ArrayList<>();

    public void identifyLexemes(){
        File myFile = new File("program.txt");
        try{
            FileReader reader = new FileReader(myFile);
            BufferedReader buffreader = new BufferedReader(reader);
            StringBuffer buffer = new StringBuffer();
            int ch;

            while((ch = buffreader.read()) != -1){
                char temp = (char)ch;

                if(!Character.isWhitespace(temp)){
                    buffer.append(temp);

                    if (buffer.toString().equals("//")) {
                        buffreader.readLine();
                        buffer.delete(0, buffer.length());
                    }

                    if(temp == '(' || temp == ')'){

                    }
                }
            }

        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void main(String[] args) {

    }
}
