package tyss.Assignments;

public class SumOf2NumbersInArrayis11_Assignment {
	

	    public static void main(String[] args) {
	        int a[] = {8, 2, 3, 7, 6, 4, 9, 5};
	        int targetSum = 11;

	        System.out.println("Pairs that gives sum = 11:");

	        // Iterate through each element in the array
	        for (int i = 0; i < a.length; i++) 
	        {
	            // Nested loop to compare the current element with the rest of the elements
	            for (int j = i + 1; j < a.length; j++) 
	            {
	                // Check if the pair of numbers adds up to the target sum
	                if (a[i] + a[j] == targetSum) 
	                {
	                    // Print the pair if the sum is equal to the target sum
	                    System.out.println("(" + a[i] + ", " + a[j] + ")");
	                }
	            }
	        }
	    }
	}


