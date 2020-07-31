

import java.lang.*;

public class StringBufferDemo {

   public static void main(String[] args) {

      StringBuffer buff = new StringBuffer("First ");
      System.out.println("buffer = " + buff);

      // appends the boolean argument as string to the string buffer
      buff.append(true);
      
      // print the string buffer after appending
      System.out.println("After append = " + buff);

      buff = new StringBuffer("Second ");
      System.out.println("buffer = " + buff);
      
      // appends the boolean argument as string to the string buffer    
      buff.append(false);
      
      // print the string buffer after appending
      System.out.println("After append = " + buff);
   }
}