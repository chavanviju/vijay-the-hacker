package imp2Array;

public class ReverseArray {
	
	//Program to print the elements of an array in reverse order.
	
	public static void main(String[] args) {
		
		
		
		int[] arr ={ 1, 2, 3, 4, 5 };  //Declare and initialize an array.
		
		
		
		System.out.println("Array in reverse order: ");  
		//Loop through the array in reverse order that is, the loop will start from (length of the array - 1) and
		
		//end at 0 by decreasing the value of i by 1.
	
		
		for (int i = arr.length - 1; i >= 0; i--) {
			
			
			System.out.print(arr[i] + " "); //Print the element arr[i] in each iteration.
		}
	}
	
}
