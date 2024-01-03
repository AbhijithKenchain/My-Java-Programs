package tyss.Strings;

public class murga {
    public static void main(String[] args) {
        String s = "my name is prakash";
        reverseWords(s);
    }

    public static void reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord).append(" ");
        }

        System.out.println(reversedString.toString().trim());
    }
}

	

	    

