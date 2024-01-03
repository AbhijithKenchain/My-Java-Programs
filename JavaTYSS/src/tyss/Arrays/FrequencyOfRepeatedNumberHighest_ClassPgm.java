package tyss.Arrays;

public class FrequencyOfRepeatedNumberHighest_ClassPgm {

    public static void main(String[] args) {
        
        // Array of integers
        int a[] = {1, 2, 2, 2, 3, 3, 4, 4, 4, 5, 5, 6, 6, 6, 6, 6, 7, 7, 7, 7};

        // Variables to store the maximum frequency and the corresponding value
        int max = 0;
        int val = 0;

        // Outer loop to iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            // Counter to keep track of the frequency of the current element
            int count = 1;

            // Inner loop to compare the current element with the rest of the elements in the array
            for (int j = i + 1; j < a.length; j++) {
                // If the current element is equal to any other element, increment the counter
                if (a[i] == a[j]) {
                    count++;
                }
            }

            // Check if the frequency of the current element is greater than the current maximum
            if (count > max) {
                // Update the maximum frequency and the corresponding value
                max = count;
                val = a[i];
            }
        }

        // Print the element with the highest frequency and its occurrence count
        System.out.println(val + " Occuring ------> " + max + " times");
    }
}

