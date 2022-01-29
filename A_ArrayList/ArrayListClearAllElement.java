 
import java.util.*;

public class ArrayListClearAllElement{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Amir","Ashif","taslim","Faruk"));
		System.out.println(al);
		System.out.println("\nClear the List Element\n");

		al.clear();
		System.out.println(al);
		
	}
		
}