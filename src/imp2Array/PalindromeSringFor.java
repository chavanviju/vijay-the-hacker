package imp2Array;

public class PalindromeSringFor {
	 public static void main(String[] args) {

		    String str = "Radar", reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) { //The loop runs from the end to the beginning of the string.
		    	
		      reverseStr = reverseStr + str.charAt(i);  //The charAt() method accesses each character of the string.
		                                                 //Each character of the string is accessed in reverse order and stored in reverseStr
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) { //The toLowerCase() method converts both str and reverseStr to lowercase.
		    	                                                    //This is because Java is case sensitive and 'r' and 'R' are two different values.
		    	
		      System.out.println(str + " is a Palindrome String.");
		      
		    }                                                                  //The equals() method checks if two strings are equal.

		    else {
		    	
		      System.out.println(str + " is not a Palindrome String.");
		      
		    }
		  }
		}
		
	
	
	


