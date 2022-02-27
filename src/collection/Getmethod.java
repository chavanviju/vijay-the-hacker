package collection;

import java.util.ArrayList;

public class Getmethod {

	
	public static void main(String[] args) {

		ArrayList List = new ArrayList();

		List.add("banana");

		List.add("Leman");

		ArrayList obj = new ArrayList();

		obj.add("apple");
		obj.add("Orange");
		obj.add(1, "Cherry");
		obj.addAll(List);

		obj.set(2, "straberry");

		// Object result2 = obj.get(2);

		// System.out.println(result2.toString());

		for (int i = 0; i < obj.size(); i++) {

			Object result2 = obj.get(i);
			 System.out.println(result2.toString());

		}
		
		
		
		
	}
	
	
	
	
	
	
}
