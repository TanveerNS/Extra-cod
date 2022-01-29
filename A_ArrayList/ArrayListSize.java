import java.util.*;

public class ArrayListSize{
	public static void main(String args[]){
		ArrayList<String> name = new ArrayList<String>(Arrays.asList("Afzal","Amir","Belal","Chand"));
		System.out.println("*********Dispaying ArrayList Element\nAdding One Element in the ArrayList");
		System.out.println(name);
		System.out.println("ArrayList Size : "+name.size());
		name.add("Zakir");
		System.out.println(name);
		int size= name.size();
		System.out.println("ArrayList Size : "+size);
		
	}
	
}