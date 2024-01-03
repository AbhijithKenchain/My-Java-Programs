package tyss.Strings;

public class OccuranceOfEachCharInAString_Ashish {

	public static void main(String[] args) {
		String s = "Auto Tester";
		// Convert the string to lowercase and then to a character array
		char[] ch = s.toLowerCase().toCharArray();

		// Boolean array to keep track of whether a character has been counted
		boolean[] flag = new boolean[ch.length];

		// Iterate through each character in the array
		for (int i = 0; i < ch.length; i++) {
			// Check if the character has not been counted before
			if (flag[i] == false) {
				int count = 1;

				// Iterate through the remaining characters in the array
				for (int j = i + 1; j < ch.length; j++) {
					// Check if the characters are the same
					if (ch[i] == ch[j]) {
						count++;
						// Mark the matched character as counted
						flag[j] = true;
					}
				}//j loop
				// Print the character and its count
				System.out.println(ch[i] + " repeating ---------> " + count + " times");
			}//first if closing
			
		}//i loop closing
	}
}
