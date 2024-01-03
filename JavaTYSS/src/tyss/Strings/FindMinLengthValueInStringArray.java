package tyss.Strings;

public class FindMinLengthValueInStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s = { "ab", "abc", "abcd", "ef", "cdef" };
		String fmin=s[0];
		String fmax=s[0];
		for (int i = 0; i < s.length; i++) {
			if (fmin.length()>s[i].length())
			{
				fmin=s[i];
			}
		
		}

		System.out.println(fmin);
		for(int i=0;i<s.length;i++)
		{
			if(fmin.length()==s[i].length())
			{
			
				System.out.print(s[i]+" ");
			}
		}
		System.out.println();
		System.out.println("------------------");
		for(int i=0;i<s.length;i++)
		{
			if(fmax.length()<s[i].length())
			{
				fmax=s[i];
			}
		}
		System.out.print("max length of array     "+fmax);
	}

}
