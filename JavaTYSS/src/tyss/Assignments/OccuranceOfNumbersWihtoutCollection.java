package tyss.Assignments;

public class OccuranceOfNumbersWihtoutCollection {
public static void main(String[] args) {
	
int[]a= {5,4,4,2,5,4,2,1};
boolean[] flag=new boolean[a.length];
	for (int i = 0; i < a.length; i++) {
		// Check if the character has not been counted before
		if (flag[i] == false) {
			int count = 1;

			// Iterate through the remaining characters in the array
			for (int j = i + 1; j < a.length; j++) {
				// Check if the num are the same
				if (a[i] == a[j]) {
					count++;
					// Mark the matched num as counted
					flag[j] = true;
				}
			}//j loop
			// Print the number and its count
			System.out.println(a[i] + " repeating ---------> " + count + " times");
		}//first if closing
		
	}//i loop closing
}
}
