package tyss.Strings;

public class ReverseNumInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="Aabb1235dd45ee1ff44";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				System.out.print(s.charAt(i));
			}
		if(s.charAt(i)>='a' &&s.charAt(i)<='z'||s.charAt(i)>='A' && s.charAt(i)<='Z')
		{
			System.out.print(" ");
		}
		}
		System.out.println();
		String[] st = s.split("[A-Za-z]");
		for(int i=st.length-1;i>=0;i--)
		{
			System.out.print(st[i]+" ");
		}
		
	}

}
