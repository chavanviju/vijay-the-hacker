package imp;

import java.util.Arrays;

public class RemoveDuplicateCharINString {
	
	

		
		
	
	 public static void main(String[] args)   
	    {   
	        String str = "java";  
	                                                    //Converting string to character array  
	        char data[] = str.toCharArray();  
	                                                       //Calculating length of the character array  
	        
	                                                           //Creating index variable to use it as index in the modified string   
	        int index = 0;   
	    
	                                                                // Traversing character array  
	        for (int i = 0; i < data.length; i++)   
	        {   
	              
	                                                                      // Check whether str[i] is present before or not   
	            int j;   
	            for (j = 0; j < i; j++)    
	            {   
	                if (data[i] == data[j])   
	                {   
	                    break;   
	                }   
	            }   
	    
	                                                                       // If the character is not present before, add it to resulting string   
	            if (j == i)    
	            {   
	                data[index++] = data[i];   
	            }   
	        }   
	        System.out.println(String.valueOf(Arrays.copyOf(data, index)));   
	    }   
	 
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
		
}


