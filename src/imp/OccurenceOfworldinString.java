package imp;


	

	import java.util.HashMap;
	import java.util.Map;
import java.util.Map.Entry;

	public class OccurenceOfworldinString {
		//ouput
				
		
		//jva program to count thae occurance of each word in string using hashmap
		public static void main(String[] args) {
			
			String str="i am a automation tester";	
			
			String[] newString = str.split(" ");
			
			HashMap<String ,Integer> wordcountmap =new HashMap<String,Integer>();   
																						                                                                       
			for(String data:newString) {  
				
				  if(wordcountmap.containsKey(data)) {
					  
					  wordcountmap.put(data,wordcountmap.get(data) + 1);
				  }
				  else
				  {
					  wordcountmap.put(data, 1);			  
				  }		
			}
				
			for (Map.Entry data1 : wordcountmap.entrySet()) {	
				
				System.out.println(data1.getKey()  + " : " + data1.getValue());
					
			}
			
			
			
			
			
			
		} 

	}


