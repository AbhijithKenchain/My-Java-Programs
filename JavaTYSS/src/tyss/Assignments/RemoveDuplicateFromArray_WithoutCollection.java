package tyss.Assignments;

public class RemoveDuplicateFromArray_WithoutCollection {

    public static void main(String[] args) {
        int[] a = {5, 4, 4, 2, 5, 4, 2, 1,6};

        for (int i = 0; i < a.length; i++) {
            boolean ifDuplicate = false;

            // Check for duplicates in the previous elements
            for (int j = i+1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    ifDuplicate = true;
                    break;
                }
            }

            // Print the element if it's not a duplicate
            if (!ifDuplicate) {
                System.out.print(a[i] + " ");
            }
        }
    }
}

	



