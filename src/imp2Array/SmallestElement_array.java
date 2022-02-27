package imp2Array;

public class SmallestElement_array {
	
	//Program to print the smallest element present in an array.
	 public static void main(String[] args) {  
		  
	     int [] arr ={25, 11, 7, 75, 56}; //Declare and initialize an array.
	        
	        int min = arr[0];  //Store first element in the variable min.
	        
	       //Loop through the array from 0 to length of the array and compare the value of min with elements of the array.
	        
	        for (int i = 0; i < arr.length; i++) {  
	        	
	           if(arr[i] <min) //If any element is less than min, min will hold the value of that element.
	        	   
	               min = arr[i];  //At last, min will represent the smallest element in the array.
	         }
	        System.out.println("Smallest element present in given array: " + min);  
	    }  
	
}
	


