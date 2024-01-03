package tyss.Patterns;



	public class NumberPyramid {
	    public static void main(String[] args) {
	        int n = 3; // Adjust the value of 'n' based on the desired number of rows

	        for (int i = 1; i <= n; i++) {
	            // Print spaces
	            for (int j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }

	            // Print increasing numbers
	            for (int k = 1; k <= i; k++) {
	                System.out.print(k);
	            }

	            // Print decreasing numbers
	            for (int l = i - 1; l >= 1; l--) {
	                System.out.print(l);
	            }

	            System.out.println(); // Move to the next line
	        }
	    }
	}


