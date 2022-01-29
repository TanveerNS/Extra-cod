import java.util.*;

public class VectorCapacity {
	public static void main(String[] args){
		Vector<String> vt =new Vector<String>(Arrays.asList("Graphs","PineApple"));
		vt.add("Mango");
		vt.add("Apple");
		vt.add("Orange");
		System.out.println(vt);
		System.out.println("The size of index  "+vt.capacity());

		
		Iterator<String> it =vt.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		vt.add("Banana");
		vt.add("Bleas");
		vt.add("Tskjdl");
		vt.add("Tree");
		vt.add("Tsdfjdkfj");
		System.out.println(vt);
		int in = vt.capacity ();
		System.out.println("The size of index  " +in);
		for(String s:vt){
		System.out.println(s);
		}
	}
}
