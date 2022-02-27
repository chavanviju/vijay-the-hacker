package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class iterator {
	
	
	
	public static void main(String[] args) {

		ArrayList List = new ArrayList();

		List.add("banana");

		List.add("Leman");

		ArrayList obj = new ArrayList();

		obj.add("apple");
		obj.add("Orange");
		obj.add(1, "Cherry");
		obj.addAll(List);

		obj.set(3, "straberry");
		
		
		Iterator data=obj.iterator();
		
		
     while(data.hasNext()) {
    	 
    	 System.out.println(data.next());
    	 
    	 
     }
		
		
		
		
		
	}	
	
	
	
	
	
	
	
	
	

}
