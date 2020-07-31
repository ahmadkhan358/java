import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class LexAna {

    public List<Float> constants;
    protected SymbolTable symbolTable;
    protected String[] arithmetics = {"+", "-", "*", "/", "%"};
    protected String[] keyWords = {"for", "while", "if", "else"};
    protected String[] datatypes = {"int", "float", "char"};
    protected String[] logicals = {"&&", "||", "!"};
    protected String[] relationals = {"<", ">", "==", "!=", "<=", ">="};
    protected String[] operators = {"(", ")", "{", "}", "[", "]"};
    protected String assignment = "=";
    protected String terminator = ";";
    protected String comment = "//";
    protected String multicommentstart = "/*";
    protected String multicommentend = "*/";
    protected String identifiers = "[a-zA-Z$_][a-zA-Z0-9$_]*";
    protected String floatingPoints = "[+-]?[0-9]+(\\\\.[0-9]+)?([Ee][+-]?[0-9]+)?";
    protected String integers = "[+-]?[0-9][0-9]*";


    public LexAna(){
        symbolTable = new SymbolTable();
        constants = new ArrayList<>();
    }

    public void inAction(String filename) {
        File myFile = new File(filename);
        try {
            FileReader reader = new FileReader(myFile);
            BufferedReader buffReader = new BufferedReader(reader);
            StringBuffer buffer = new StringBuffer(30);
            int scopeLevel = 0;
            String lexeme;
            int ch;

            while((ch = buffReader.read()) != -1){
                char temp = (char)ch;
                buffer.append(temp);
                if (buffer.toString().equals(comment)) {
                    buffReader.readLine();
                    buffer.delete(0, buffer.length());
                }

                if (temp == '{') {
                    scopeLevel++;
                }

                if (temp == '}') {
                    scopeLevel--;
                }


                if(Character.isWhitespace(temp)){
                    if(checkForPresentLexeme(datatypes, buffer.toString()) || checkForPresentLexeme(keyWords, buffer.toString())){
                        buffer.delete(0, buffer.length());
                    }else{
                        if(Pattern.matches(identifiers, buffer.toString())){
                            symbolTable.insert(buffer.toString(), new HashNode("identifier", scopeLevel, null, -1, -1, -1, -1, null,, null, null, null));
                        }
                    }
                }



                if(temp == ';'){
                    buffer.deleteCharAt(buffer.length()-1);
                }

                System.out.println(buffer.toString());

//                if(Character.isWhitespace(temp)) {
//                    lexeme = buffer.toString();
//                    buffer.delete(0, buffer.length());
//                    System.out.println(lexeme);
//                    if (!(checkForPresentLexeme(arithmetics, lexeme) || checkForPresentLexeme(keyWords, lexeme) || checkForPresentLexeme(datatypes, lexeme)
//                            || checkForPresentLexeme(logicals, lexeme) || checkForPresentLexeme(relationals, lexeme) || assignment.equals(lexeme)
//                            || terminator.equals(lexeme) || comment.equals(lexeme) || multicommentstart.equals(lexeme)
//                            || multicommentend.equals(lexeme))) {
//                        if (Pattern.matches(indentifiers, lexeme)) {
//                            symbolTable.insert(lexeme, new HashNode("identifier", scopeLevel, null, -1, -1, -1, 0, null, null, null, null));
//                        } else if (Pattern.matches(floatingPoints, lexeme) || Pattern.matches(integers, lexeme)) {
//                            constants.add(Float.valueOf(lexeme));
//                        }
//                    }
//                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    public boolean checkForPresentLexeme(String[] array, String lexeme){
        boolean acknowledgement = false;
        for(String i: array){
            if(i.equals(lexeme)) {
                acknowledgement = true;
                break;
            }
        }

        return acknowledgement;
    }

    public void printSymbolTable(){
        symbolTable.printTable();
    }

    public static void main(String[] args) {
        LexAna la = new LexAna();

        la.inAction("program.txt");
        la.printSymbolTable();

        for(float f: la.constants){
            System.out.println(f);
        }

    }


}
