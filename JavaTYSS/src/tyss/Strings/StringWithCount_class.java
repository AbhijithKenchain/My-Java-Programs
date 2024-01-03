package tyss.Strings;

public class StringWithCount_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//String s="aabbabc";//a2b2a1b1c1
		String s = "aabbacc";// a2b2a1c2
		String dest = "";
		int count = 1;
		for (int i = 0; i <s.length()-1; i++) 
		{

			if (s.charAt(i) == s.charAt(i + 1)) 
			{
				count++;

			} 
			else 
			{
				System.out.print(s.charAt(i) + "" + count);
				count = 1;
			}
		}
		System.out.print(s.charAt(s.length() - 1) + "" + count);

	}

}
