package tyss.Arrays;

public class FrequencyOfRepeatedNumbers {

	public static void main(String[] args) {
		// Initialize the array with some numbers
		int[] a = { 1, 2, 3, 4, 5, 1, 2, 3, 4, 1, 2, 1,2 };

		// Get the length of the array
		int n = a.length;

		// Outer loop to iterate through each element of the array
		for (int i = 0; i < n; i++) {
			// Check if the element is already processed (not marked as -1)
			if (a[i] != -1) {
				// Initialize a counter for the frequency of the current element
				int count = 1;

				// Inner loop to iterate through the rest of the array
				// Count the frequency and mark the repeated elements with -1
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						// Increment the frequency counter
						count++;

						// Mark the repeated element by setting it to -1
						a[j] = -1;
					}
				}

				// Print the frequency of the current element
				System.out.println("Frequency of " + a[i] + ": " + count);
			}
		}
	}
}
