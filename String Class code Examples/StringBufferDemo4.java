import java.lang.*;

public class StringBufferDemo4 {

   public static void main(String[] args) {

      StringBuffer buff = new StringBuffer("amrood ");
      System.out.println("buffer = " + buff);
    
      // char array
      char[] str = new char[]
      {'a','d','m','i','n','i','s','t','r','a','t','o','r'};
	
      /* appends the string representation of char array argument to
         this string buffer with offset at index 0 and length as 5 */
      buff.append(str, 0, 5);
	
      // print the string buffer after appending
      System.out.println("After append = " + buff);
   }
}