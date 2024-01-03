package tyss.Strings;

public class OccuranceOfEachCharacter_CLass_pgm {

	public static void main(String[] args) {
		String st = "Tester";

		// Convert the string to lowercase to make the counting case-insensitive
		String s = st.toLowerCase();

		// Iterate through each character in the string
		for (int i = 0; i < s.length(); i++) {
			int count = 0;

			// Iterate through the string to count occurrences of the current character
			for (int j = 0; j < s.length(); j++) {
				// Check if the characters at positions i and j are the same
				if (s.charAt(i) == s.charAt(j)) {
					// If i is greater than j, it means we've already counted this character
					// break the inner loop to avoid duplicate counting
					if (i > j) {
						break;
					} else {
						count++; // Increment the count for each occurrence of the character
		
					}
				}
			}

			// If the count is greater than or equal to 1, print the result
			if (count >= 1) {
				System.out.println(s.charAt(i)+ " repeating ------->  " + count + " times " );
				//for removing duplicates without collection
				
				//System.out.print(s.charAt(i)+" ");
			}
		}
	}
}

