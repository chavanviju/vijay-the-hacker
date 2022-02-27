package imp2Array;

public class SortAscending_Array {
	
	//Program to sort the elements of an array in ascending order.
	
	public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 7, 1 }; // Declare and initialize an array.

		int temp = 0;

		for (int i = 0; i < arr.length; i++) { // Loop through the array and select an element.

			// The inner loop will be used to compare the selected element from the outer
			// loop with the rest of the elements of the array.

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) { // If any element is less than the selected element then swap the values.

					temp = arr[i]; // Continue this process till entire array is sorted in ascending order.

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.println("Elements of array sorted in ascending order: ");

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");

		}}}

	
	
	
	


