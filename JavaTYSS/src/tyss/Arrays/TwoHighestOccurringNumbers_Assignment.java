package tyss.Arrays;


public class TwoHighestOccurringNumbers_Assignment {

    public static void main(String[] args) {

        int a[] = {4,4,5,5,5,7,7,7,7,8,8,8,8,8};

        // Variables for the first and second highest occurrences
        int firstMax = 0;
        int secondMax = 0;

        // Variables for values corresponding to the first and second highest
        // occurrences
        int valFirstMax = 0;
        int valSecondMax = 0;

        // Iterate through each element in the array
        for (int i = 0; i < a.length; i++) {
            int count = 1;

            // Inner loop to compare the current element with the rest of the elements in
            // the array
            for (int j = i + 1; j < a.length; j++) {
                // If the current element is equal to any other element, increment the counter
                if (a[i] == a[j]) {
                    count++;
                }
            }

            // Check if the frequency of the current element is greater than the first
            // maximum
            if (count > firstMax) {
                // Shift the current maximum to the second maximum
                secondMax = firstMax;
                valSecondMax = valFirstMax;

                // Update the maximum and its value
                firstMax = count;
                valFirstMax = a[i];
            }
            else if (count > secondMax && valSecondMax!=valFirstMax) {
                // Update the second maximum and its value
                secondMax = count;
                valSecondMax = a[i];
            }
        }

        // Print the first highest occurring number and its occurrence count
        System.out.println(valFirstMax + " Occurring ------> " + firstMax + " times");

        // Print the second highest occurring number and its occurrence count
        System.out.println(valSecondMax + " Occurring ------> " + secondMax + " times");
    }
}
