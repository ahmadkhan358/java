
import java.lang.*;

public class StringBufferDemo3 {

   public static void main(String[] args) {

      StringBuffer buff = new StringBuffer("tuts ");
      System.out.println("buffer = " + buff);
    
      // char array
      char[] str = new char[]{'p','o','i','n','t'};
	
      /* appends the string representation of char array argument to
         this string buffer */
      buff.append(str);
      
      // print the string buffer after appending
      System.out.println("After append = " + buff);
   }
}