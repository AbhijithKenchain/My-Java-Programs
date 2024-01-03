
package tyss.Strings;

import org.testng.annotations.Test;

public class SwapFirstWordAndLastWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "i am software engineer";
		System.out.println("before swapping ---------> " + s);

		String words[] = s.split("\\s+");

			String fword = words[0];//s1
			String lword = words[words.length - 1];//s2

			words[0] = lword;//
			words[words.length - 1] = fword;
			for(String w:words)
			{
				System.out.print(w+" ");
			}
		
	}

	@Test
	public void swap()
	{
		String s="welcome to expleo home";
		String[] s1 = s.split(" ");
		
			String f=s1[0];
			s1[0]=s1[s1.length-1];
			s1[s1.length-1]=f;
			for(int i=0;i<s1.length;i++)
			{
				System.out.print(s1[i]+" ");
			}
			
			
		
	}
}
