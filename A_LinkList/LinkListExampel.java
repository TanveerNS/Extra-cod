import java.util.*;

public class LinkListExampel{	
	public static void main(String[] args){
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("Apple");
		ll.add("Grapes");
		ll.add(1,"Mango");
		System.out.println(ll);
		for(String s :ll){
			System.out.println(s);
		}
	}
}