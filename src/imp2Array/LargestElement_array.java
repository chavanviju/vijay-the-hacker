package imp2Array;

public class LargestElement_array {
	
	
	//Program to print the largest element present in an array.
	
	
	public static void main(String[] args) {

		
		
		int[] arr = { 25, 11, 7, 75, 56 }; //Declare and initialize an array.
		
		
		int max = arr[0];   //Store first element in variable max.
		
		
		//Loop through the array from 0 to length of the array and compare the value of max with elements of the array.
		
		for (int i = 0; i < arr.length; i++) { 
			
			
			
			if (arr[i] > max) //If any element is greater than max, max will hold the value of that element.
				
				max = arr[i]; //At last, max will hold the largest element in the array.
		}
		System.out.println("Largest element present in given array: " + max);
	}
}
