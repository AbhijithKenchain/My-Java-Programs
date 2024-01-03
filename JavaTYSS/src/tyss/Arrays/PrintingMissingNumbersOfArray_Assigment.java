package tyss.Arrays;

public class PrintingMissingNumbersOfArray_Assigment {
	

	    public static void main(String[] args) {
	        int a[] = {1, 3, 6, 7, 9};

	        // Define the range of expected values
	        int startRange = 1;
	        int endRange = 10; // Assuming the range is up to 10, adjust as needed

	        System.out.println("Missing numbers in the array:");

	        // Iterate through the range and check for missing numbers
	        for (int i = startRange; i <= endRange; i++) {
	            boolean found = false;

	            // Check if the current value is present in the array
	            for (int j = 0; j < a.length; j++) {
	                if (a[j] == i) {
	                    found = true;
	                    break;
	                }
	            }

	            // If the current value is not found, print it as a missing number
	            if (!found) {
	                System.out.print(i+" ");
	            }
	        }//first loop ends
	    
	    {
	    	
	    }
	    }
	    
	    
	}


