package collection;

import java.util.ArrayList;

public class ArrayListDemo {
	
	
public static void main(String[] args) {
	
	
	
	ArrayList List=new ArrayList();
	
	
	List.add("banana");
	
	List.add("Leman");
	

      ArrayList obj=new ArrayList();
	
	    
	obj.add("apple");
	obj.add("Orange");
	obj.add(1,"Cherry");
	obj.addAll(List);
	
	obj.set(2, "straberry");
	
	boolean result = obj.contains("banana");
	System.out.println(result);
	
	
	obj.clear();
	
	
	boolean result1 = obj.isEmpty();
	
	
	
	System.out.println("array is not empty   "+result1);
	
	
	
	System.out.println(obj);
	
}
	
	
	
	
	
	
	
	
	

}
