import java.util.*;
public class LinkListSize{
	public static void main(String args[]){
		
		LinkedList<String> lSize = new LinkedList<String>(Arrays.asList("Mango","Apple","Graphes","Orange"));
		
		System.out.println(lSize);
		System.out.println("Size of LinkedList : " + lSize.size());
		
		lSize.add("PineApple");
		System.out.println(lSize);
		
		int size=lSize.size();
		System.out.println("Size of LinkedList : " + size);
	}
}