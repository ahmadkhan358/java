public class Test10 {

   public static void main(String args[]) {
      String str1 = "Not immutable";
      String str2 = "Strings are immutable";
      StringBuffer str3 = new StringBuffer( "Not immutable");

      boolean  result = str1.contentEquals( str3 );
      System.out.println(result);
	  
      result = str2.contentEquals( str3 );
      System.out.println(result);
   }
}