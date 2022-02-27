package imp;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharinHashMap {

	 public static void main(String[] args) {
		 
		 
		    String str = "Acceleration";
		                                                              
		                                                                      
		    char[] strArray =str.toLowerCase().toCharArray();
		  
				
				
				HashMap<Character ,Integer> map =new HashMap<Character ,Integer>();   
																							                                                                       
				for(char data:strArray) {  
					
					  if(map.containsKey(data)) {
						  
						  map.put(data,map.get(data) + 1);
					  }
					  else
					  {
						  map.put(data, 1);			  
					  }		
				}
				
				//Getting a Set containing all keys of Map
				 Set<Character> charsInString = map.keySet();
				 
				 for (char data1 : charsInString)
			        {
			            if(map.get(data1) > 1)     //If any char has a count of more than 1, printing it's count
			            {
					
					System.out.println(data1 +" : "+ map.get(data1));
					
					}
						
				}
				
				
				
				
				
				
			} 

		}

	
	

		        
		        
  
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	
	
	
	
	
	
	

