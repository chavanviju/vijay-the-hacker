package imp;

public class DuplicateCharInString {
	
	//program to find duplicate character in String 
	
	
	public static void main(String[] args) {
		
		
		
		String str="maheshbabu";
	
		char[] data=str.toCharArray();
		
		
		for(int i=0;i<str.length();i++) {
			
			for(int j=i+1;j<str.length();j++) {
				
				if(data[i]==data[j]) {
					
					System.out.println("Duplicate char   :"+data[j]);
					
					
				}
				
				
				
			}
			
			
			
		}
		
		
		
		
	}
	
	
	
	
	

}
