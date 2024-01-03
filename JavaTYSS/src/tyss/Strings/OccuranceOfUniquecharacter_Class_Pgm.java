package tyss.Strings;

public class OccuranceOfUniquecharacter_Class_Pgm {

	public static void main(String[] args) {
		

		
		String st="Tester";
		String s=st.toLowerCase();
		for(int i=0;i<st.length();i++)
		{
			int count=0;
			for(int j=0;j<st.length();j++)
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
			if(count==1)
			{
				System.out.println(s.charAt(i)+" repeating -----> "+count+" times ");
			}
		}
	}

}
