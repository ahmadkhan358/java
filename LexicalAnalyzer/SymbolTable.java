import java.util.List;
import java.util.Hashtable;


public class SymbolTable {

    public Hashtable<String, HashNode> symbolTable;

    public SymbolTable(){
        symbolTable = new Hashtable<>();



        /*
        * Arithmetic Operators */
        symbolTable.put("+", new HashNode("arithmetic", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("-", new HashNode("arithmetic", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("*", new HashNode("arithmetic", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("/", new HashNode("arithmetic", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("%", new HashNode("arithmetic", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Key Words*/
        symbolTable.put("for", new HashNode("keyword", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("while", new HashNode("keyword", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("if", new HashNode("keyword", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("else", new HashNode("keyword", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Data Types*/
        symbolTable.put("int", new HashNode("datatype", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("float", new HashNode("datatype", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("char", new HashNode("datatype", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Logical Operators*/
        symbolTable.put("&&", new HashNode("logical", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("||", new HashNode("logical", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("!", new HashNode("logical", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Relational Operators*/
        symbolTable.put("<", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put(">", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("==", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("!=", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("<=", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put(">=", new HashNode("relational", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Parenthesis*/
        symbolTable.put("(", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put(")", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Braces*/
        symbolTable.put("{", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("}", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Square Brackets*/
        symbolTable.put("[", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));
        symbolTable.put("]", new HashNode("operator", 0, null, 0, 0, 0, 0, null, null, null, null));


        /*
        * Assignment Operator*/
        symbolTable.put("=", new HashNode("assignment", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Terminator*/
        symbolTable.put(";", new HashNode("terminator", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Comment*/
        symbolTable.put("//", new HashNode("comment", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Multiline Comment Start*/
        symbolTable.put("/*", new HashNode("multicommentstart", 0, null, 0, 0, 0, 0, null, null, null, null));

        /*
        * Multiline Comment End*/
        symbolTable.put("*/", new HashNode("multicommentend", 0, null, 0, 0, 0, 0, null, null, null, null));

    }

    public void insert(String key, HashNode value){
       HashNode temp = symbolTable.get(key);
       if(temp == null){
           symbolTable.put(key, value);
       }
    }


    public void printTable(){

        System.out.println("Key -> Value");
       for(String key: symbolTable.keySet()){
           HashNode values = symbolTable.get(key);
           System.out.print(key + " -> ");
           System.out.print("token : " + values.token + ", ");
           System.out.print("Scope Level : " + values.scopeLevel + ", ");
           System.out.print("Data Type : " + values.dataType + ", ");
           System.out.print("Lower Bound : " + values.lowerBound + ", ");
           System.out.print("Upper Bound : " + values.upperBound + ", ");
           System.out.print("Length Of Array : " + values.lengthOfArray + ", ");
           System.out.print("Number Of Parameters : " + values.numberOfParameters + ", ");
           List<String> params = values.typesOfParams;
           System.out.print("Parameters : ");
           if(params != null){

               for(String p: params){
                   System.out.print(p + " ");
               }
           }else{
               System.out.print("null" + ", ");
           }

           System.out.print("Return Type : " + values.returnType + ", ");
           System.out.print("Value : " + values.value);

           System.out.print("\n");

       }
    }

}
