import java.lang.*;

public class StringBufferDemo2 {

   public static void main(String[] args) {

      StringBuffer buff = new StringBuffer("tuts ");
      System.out.println("buffer = " + buff);
    
      // appends the char argument as string to the string buffer.
      buff.append('A');
      
      // print the string buffer after appending
      System.out.println("After append = " + buff);

      buff = new StringBuffer("abcd ");
      System.out.println("buffer = " + buff);
      
      // appends the char argument as string to the string buffer.    
      buff.append('!');
      
      // print the string buffer after appending
      System.out.println("After append = " + buff);
   }
}