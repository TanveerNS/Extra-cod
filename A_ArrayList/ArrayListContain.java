 
import java.util.*;

public class ArrayListContain{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Amir","Ashif","taslim","Faruk"));
		System.out.println(al);
		System.out.println("\n Check list of name Faruk if its have list, then return True\n");

		boolean bl=al.contains("Faruk");
		System.out.println(bl);
		
		System.out.println("\n Check list of name Samir if it \n");
		System.out.println(al.contains("Samir"));
		
		System.out.println("\n********Displaying Using Loop Iterator");
		for(String s:al){ // Iterating Using for loop
			System.out.println(s);
		}
	
		System.out.println("\n******Displaying Using Iterator Interface ");
		Iterator<String> it = al.iterator();  //Displaying Using Iterator interface
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\n******* Direct Displaying ");
		System.out.println(al);
	}
		
}