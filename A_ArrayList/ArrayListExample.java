import java.util.*;
public class ArrayListExample{
	public static void main(String[] args){
		
		ArrayList<String> al = new ArrayList<String>(
		Arrays.asList("Tanveer","Tauqeer","Tausheef","Ashahad","Abubaker"));//Initialize ArrayList using Arrays.asList()
		
		Iterator<String> it = al.iterator();      //Displaying using Iterator interface
		
		System.out.println("**********Displaying Using Iterator interface");
        while(it.hasNext()){
 
			System.out.println(it.next());
	    }
	    ArrayList<String> als = new ArrayList<String>();
	    als.add("Tanveer");
	    als.add("Abubakar");
	    als.add(1,"Tauqeer");
	    als.add("Ashahad");
	    als.add(2,"Tausheef");
	   
	    System.out.println("\n*********Displaying Using For Loop");
		for(String s:al){  //Iterating using for loop
			System.out.println(s);
		}
		
	}
	
}