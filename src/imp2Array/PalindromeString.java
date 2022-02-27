package imp2Array;



public class PalindromeString {

	public static void main(String[] args) {
	    
	    int num = 3553, reversedNum = 0, remainder;
	    
	    
	    int originalNum = num;          // store the number to originalNum
	    
	    
	   
	    while (num != 0) {             // get the reverse of originalNum
	      remainder = num % 10;              // store it in variable
	      reversedNum = reversedNum * 10 + remainder;
	      num /= 10;
	    }
	    
	    
	    if (originalNum == reversedNum) {         // check if reversedNum and originalNum are equal
	      System.out.println(originalNum + " is Palindrome.");
	    }
	    else {
	      System.out.println(originalNum + " is not Palindrome.");
	    }
	  }
	}
	
		 
	
	
	
	
	
	
	
	
	
	
	
	
	


