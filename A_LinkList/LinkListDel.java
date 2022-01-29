import java.util.*;
public class LinkListDel{
	public static void main(String[] args){
		LinkedList<String> boxd = new LinkedList<String>(Arrays.asList("Orange","Mango","Apple","Graphes"));
		System.out.println(boxd);
		boxd.remove(1);
		System.out.println(boxd);
		boxd.remove("Apple");
		Iterator it= boxd.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}
}