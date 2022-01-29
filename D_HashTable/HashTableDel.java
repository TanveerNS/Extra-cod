import java.util.*;
public class HashTableDel{
	public static void main(String[] args){
		
		Hashtable<Integer,String> hTable = new Hashtable<>();
		
		hTable.put(1000,"Apple");
		hTable.put(1001,"Graphes");
		hTable.put(1002,"Orange");
		hTable.put(1003,"Banana");
		hTable.put(1004,"Mango");
		
		System.out.println(hTable);
		hTable.remove(1000);
		System.out.println(hTable);
			
	}
}