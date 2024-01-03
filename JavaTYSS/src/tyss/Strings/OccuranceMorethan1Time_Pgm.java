package tyss.Strings;

public class OccuranceMorethan1Time_Pgm {
	

		public static void main(String[] args) {
			
			
	String st="Tester";
	String s=st.toLowerCase();
	for(int i=0;i<s.length();i++)
	{
		int count=0;
		
		for(int j=0;j<s.length();j++)
		{
			if(s.charAt(i)==s.charAt(j))
			{
				if(i>j)
				{
					break;
				}
				else
				{
					count++;
				}
			}
		}
		if(count>=0)
		{
			System.out.println(s.charAt(i)+" repeating ------->  "+count+" times ");
		}
	}
		}
}

