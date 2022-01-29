import java.util.*;
public class LinkedHashSetEx {

   public static void main(String args[]) {
      // create a hash set
      LinkedHashSet hs = new LinkedHashSet();
      
      // add elements to the hash set
      hs.add("B");
      hs.add("A");
      hs.add("D");
      hs.add("E");
      hs.add("C");
      hs.add("F");
      System.out.println(hs);
   }
}