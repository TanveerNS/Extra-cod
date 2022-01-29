import java.util.*;

public class VectorDel {
	public static void main(String[] args){
		Vector<String> vt =new Vector<String>(Arrays.asList("Graphs","PineApple"));
		vt.add("Mango");
		vt.add("Apple");
		vt.add("Orange");
		System.out.println(vt);
		
		vt.remove(2);
		Iterator<String> it =vt.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		System.out.println("");
		for(String s:vt){
		System.out.println(s);
		}
	}
}
