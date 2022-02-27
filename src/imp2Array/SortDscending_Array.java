package imp2Array;

public class SortDscending_Array {
	//Program to sort the elements of an array in descending order.
	
public static void main(String[] args) {

		int[] arr = { 5, 2, 8, 7, 1 }; // Declare and initialize an array.

		int temp = 0;

		for (int i = 0; i < arr.length; i++) { // Loop through the array and select an element.

			// Inner loop will be used to compare selected element from outer loop with rest
			// of the elements of array.

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] < arr[j]) { // If any element is greater than the selected element then swap the values.

					temp = arr[i]; // Continue this process till entire list is sorted in descending order

					arr[i] = arr[j];

					arr[j] = temp;
				}
			}
		}

		System.out.println("Elements of array sorted in descending order: ");

		for (int i = 0; i < arr.length; i++) { // Displaying elements of array after sorting

			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	
	
	
	
	

}
