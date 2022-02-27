package imp2Array;

public class SumofElementArray {

	//Java Program to print the sum of all the items of the array
	
	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 }; // Initialize an array arr and a variable sum.

		int sum = 0; // Set the value of sum=0.

		for (int i = 0; i < arr.length; i++) { // Start a for loop from index 0 to the length of the array – 1.

			sum = sum + arr[i]; // In every iteration, perform sum = sum + arr[i].

		}
		System.out.println("Sum of all the elements of an array: " + sum);

		// After the termination of the loop, print the value of the sum
	}

}
