package imp2Array;

public class DuplicateElementArray {
	// Program to print the duplicate elements of an array.
	public static void main(String[] args) {


		
		
		int[] arr ={ 1, 2, 3, 4, 2, 7, 8, 8, 3 }; //Declare and initialize an array.
		

		System.out.println("Duplicate elements in given array: "); //Duplicate elements can be found using two loops.
		//The outer loop will iterate through the array from 0 to length of the array.
		//The outer loop will select an element.
		//The inner loop will be used to compare the selected element with the rest of the elements of the array.
		
		                                            
		
		for (int i = 0; i < arr.length; i++) {             
			
			for (int j = i + 1; j < arr.length; j++) {
				
				if (arr[i] == arr[j])//If a match is found which means the duplicate element is found then, display the element.
					
					System.out.println(arr[j]);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
