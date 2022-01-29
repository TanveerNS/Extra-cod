import java.util.*;

public class ArrayListGet{
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>(Arrays.asList("Amir","Ashif","taslim","Faruk"));
		System.out.println(al);
		System.out.println("\ngive the index postion and return element(name)  : index-2");

		String sa=al.get(2);
		System.out.println(sa);
		
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