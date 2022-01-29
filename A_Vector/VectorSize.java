import java.util.*;

public class VectorSize extends Vector {
	public static void main(String[] args){
		Vector<String> vt =new Vector<String>(Arrays.asList("Graphs","PineApple"));
		vt.add("Mango");
		vt.add("Apple");
		vt.add("Orange");
		System.out.println(vt);
		System.out.println("The size of index  "+vt.size());

		
		vt.addElement("hhhhd");
		Iterator<String> it =vt.iterator(); 
		while(it.hasNext()){
			System.out.println(it.next());
		}
		int in = vt.size();
		System.out.println("The size of index  " +in);
		for(String s:vt){
		System.out.println(s);
		}
	}
}
